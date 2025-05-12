package decorator;

public class Salada extends IngredienteDecorator {
    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        StringBuilder sb = new StringBuilder("Salada");
        if (ingrediente != null) {
            sb.append(", ").append(ingrediente.imprimeIngrediente());
        }
        return sb.toString();
    }

    @Override
    public double valorDoIngrediente() {
        double base = 0.25;
        return ingrediente != null ? base + ingrediente.valorDoIngrediente() : base;
    }
}