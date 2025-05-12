package decorator;

public class Queijo extends IngredienteDecorator {
    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        StringBuilder sb = new StringBuilder("Queijo");
        if (ingrediente != null) {
            sb.append(", ").append(ingrediente.imprimeIngrediente());
        }
        return sb.toString();
    }

    @Override
    public double valorDoIngrediente() {
        double base = 0.75;
        return ingrediente != null ? base + ingrediente.valorDoIngrediente() : base;
    }
}