package decorator;

public class Bacon extends IngredienteDecorator {
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        StringBuilder sb = new StringBuilder("Bacon");
        if (ingrediente != null) {
            sb.append(", ").append(ingrediente.imprimeIngrediente());
        }
        return sb.toString();
    }

    @Override
    public double valorDoIngrediente() {
        double base = 1.50;
        return ingrediente != null ? base + ingrediente.valorDoIngrediente() : base;
    }
}