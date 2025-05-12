package decorator;

public class Ketchup extends IngredienteDecorator {
    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        StringBuilder sb = new StringBuilder("Ketchup");
        if (ingrediente != null) {
            sb.append(", ").append(ingrediente.imprimeIngrediente());
        }
        return sb.toString();
    }

    @Override
    public double valorDoIngrediente() {
        double base = 1.00;
        return ingrediente != null ? base + ingrediente.valorDoIngrediente() : base;
    }
}