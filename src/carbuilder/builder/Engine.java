package carbuilder.builder;

public interface Engine {
    String getType();

    class SportEngine implements Engine {
        @Override
        public String getType() {
            return "Sport Engine (V8 Turbo)";
        }
    }

    class StandardEngine implements Engine {
        @Override
        public String getType() {
            return "Standard Engine (V6)";
        }
    }
}


