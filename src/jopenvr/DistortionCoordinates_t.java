package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class DistortionCoordinates_t extends AlignedStructure {
	/** float[2] */
	public float[] rfRed = new float[2];
	/** float[2] */
	public float[] rfGreen = new float[2];
	/** float[2] */
	public float[] rfBlue = new float[2];
	public DistortionCoordinates_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("rfRed", "rfGreen", "rfBlue");
	}
	public DistortionCoordinates_t(float rfRed[], float rfGreen[], float rfBlue[]) {
		super();
		if ((rfRed.length != this.rfRed.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rfRed = rfRed;
		if ((rfGreen.length != this.rfGreen.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rfGreen = rfGreen;
		if ((rfBlue.length != this.rfBlue.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.rfBlue = rfBlue;
	}
	public DistortionCoordinates_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends DistortionCoordinates_t implements Structure.ByReference {
		
	};
	public static class ByValue extends DistortionCoordinates_t implements Structure.ByValue {
		
	};
}
