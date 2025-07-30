public static void main(String[] args) {
    File myTest = new File("src/myTestFile.txt");
    try (FileInputStream inputStream = new FileInputStream(myTest)) {
        byte[] fileContentsAsBytes = inputStream.readAllBytes();
        for (int index = 0; index < fileContentsAsBytes.length; index++) {
            System.out.println((char) fileContentsAsBytes[index]);
        }
    } catch (FileNotFoundException fileNotFoundException) {
        System.err.println("File Not Found!");
    } catch (IOException ioException) {
        System.err.println(ioException.getMessage());
    }
}
