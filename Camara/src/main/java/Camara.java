/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramse
 */
public class Camara {
    private double mpx, apertura, zoom;
    private int fps;
    private boolean siGrabaVideo;

    public Camara() {
    }

    public Camara(double mpx, double apertura, double zoom, int fps, boolean siGrabaVideo) {
        this.mpx = mpx;
        this.apertura = apertura;
        this.zoom = zoom;
        this.fps = fps;
        this.siGrabaVideo = siGrabaVideo;
    }

    public double getMpx() {
        return mpx;
    }

    public void setMpx(double mpx) {
        this.mpx = mpx;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }

    public double getZoom() {
        return zoom;
    }

    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public boolean isSiGrabaVideo() {
        return siGrabaVideo;
    }

    public void setSiGrabaVideo(boolean siGrabaVideo) {
        this.siGrabaVideo = siGrabaVideo;
    }

    @Override
    public String toString() {
        return "Camara{" + "mpx=" + mpx + ", apertura=" + apertura + ", zoom=" + zoom + ", fps=" + fps + ", siGrabaVideo=" + siGrabaVideo + '}';
    }
    
    
}
