class SuperClassException extends Exception {
    SuperClassException(String s) {
        super(s);
    }
}

class SubClassException extends SuperClassException {
    SubClassException(String s) {
        super(s);
    }
}

class classerror {
    public static void main(String[] args) {
        try {
            throw new SubClassException("This is a subclass exception");
        } catch (SubClassException e) {
            System.out.println("Caught SubClassException: " + e.getMessage());
        } catch (SuperClassException e) {
            System.out.println("Caught SuperClassException: " + e.getMessage());
        }
    }
}
