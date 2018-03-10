package factory.simplefactory;



public class MotlfWidgetFactory implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new MotlfScrollBar();
    }

    @Override
    public Window createWindow() {
        return new MotlfWindow();
    }
}
