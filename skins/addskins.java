JButton skinButton = new JButton("Select Skin");
skinButton.addActionListener(e -> {
    JFileChooser fileChooser = new JFileChooser();
    int returnValue = fileChooser.showOpenDialog(null);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        String skinFilePath = selectedFile.getAbsolutePath();
        player.setSkin(skinFilePath);
    }
});
