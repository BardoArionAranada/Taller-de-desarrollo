import java.io.IOException;

public class OptimizacionWindows {
    public static void main(String[] args) {
        // Ejecutar comandos para la optimización de Windows
        try {
            // Desactivar efectos visuales
            Runtime.getRuntime().exec("cmd /c sysdm.cpl,,3");
            Thread.sleep(1000);
            Runtime.getRuntime().exec("cmd /c \"control sysdm.cpl,,3\"");
            Thread.sleep(1000);
            Runtime.getRuntime().exec("cmd /c \"control desk.cpl,,2\"");
            Thread.sleep(1000);
            
            // Ajustar el plan de energía a Alto rendimiento
            Runtime.getRuntime().exec("cmd /c powercfg /s 8c5e7fda-e8bf-4a96-9a85-a6e23a8c635c");
            Thread.sleep(1000);
            
            // Limpiar la memoria RAM
            Runtime.getRuntime().exec("cmd /c echo 1 > wmic.exe process call create \"powershell.exe -NoProfile -ExecutionPolicy Bypass -Command \\\"[GC]::Collect()\\\"\"");
            Thread.sleep(1000);
            
            // Desactivar programas en segundo plano innecesarios
            Runtime.getRuntime().exec("cmd /c taskkill /f /im nombre_programa.exe");
            Thread.sleep(1000);
            
            System.out.println("Optimización de Windows completada.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
