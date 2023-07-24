class invalid_transaction extends Exception {
    private String errorMessage;

    public invalid_transaction(String message) {
        errorMessage = message;
    }

    public String getMessage() {
        return errorMessage;
    }
}
