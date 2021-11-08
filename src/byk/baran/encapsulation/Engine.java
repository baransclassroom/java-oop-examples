package byk.baran.encapsulation;

public class Engine {

    private float temperature;
    private short activePistonCount;
    private boolean status = false;

    public Engine() {
        this.temperature = 0.0f;
        this.activePistonCount = 0;
    }

    public void start() {
        this.status = true;
        this.activePistonCount = 4;

        var thread = new Thread(() -> {
            while (status) {

                temperature += 55;
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }

    public void stop() {
        this.status = false;
    }

    public void freezeTemperature(float freezeValue) {
        this.temperature -= freezeValue;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getActivePistonCount() {
        return this.activePistonCount;
    }

    public float getTemperature() {
        return this.temperature;
    }
}