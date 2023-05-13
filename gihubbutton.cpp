#include <windows.h>
#include <shellapi.h>

// Define the button's position and size
const int BUTTON_X = 100;
const int BUTTON_Y = 100;
const int BUTTON_WIDTH = 200;
const int BUTTON_HEIGHT = 50;

// Define the URL of your GitHub page
const char* GITHUB_URL = "https://github.com/AR-DEV-1";

// Button click event handler
void OnButtonClick()
{
    // Open the default browser and navigate to the GitHub page
    ShellExecute(NULL, "open", GITHUB_URL, NULL, NULL, SW_SHOWNORMAL);
}

// Main function
int main()
{
    // Create a window and a button
    HWND hwnd = CreateWindow("BUTTON", "GitHub", WS_VISIBLE | WS_SYSMENU,
        BUTTON_X, BUTTON_Y, BUTTON_WIDTH, BUTTON_HEIGHT, NULL, NULL, NULL, NULL);

    // Set the button's click event handler
    SendMessage(hwnd, WM_SETFONT, (WPARAM)GetStockObject(DEFAULT_GUI_FONT), MAKELPARAM(TRUE, 0));
    SetWindowText(hwnd, "GitHub");
    SetWindowLongPtr(hwnd, GWLP_USERDATA, (LONG_PTR)&OnButtonClick);
    SetWindowLongPtr(hwnd, GWLP_WNDPROC, (LONG_PTR)[](HWND hwnd, UINT msg, WPARAM wParam, LPARAM lParam) -> LRESULT {
        if (msg == WM_COMMAND && HIWORD(wParam) == BN_CLICKED)
            (*(void(**)())GetWindowLongPtr(hwnd, GWLP_USERDATA))();
        return DefWindowProc(hwnd, msg, wParam, lParam);
    });

    // Run the game loop
    MSG msg;
    while (GetMessage(&msg, NULL, 0, 0))
    {
        TranslateMessage(&msg);
        DispatchMessage(&msg);
    }

    return 0;
}
