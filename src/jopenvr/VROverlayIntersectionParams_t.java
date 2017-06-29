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
public class VROverlayIntersectionParams_t extends AlignedStructure {
	public HmdVector3_t vSource;
	public HmdVector3_t vDirection;
	/** @see ETrackingUniverseOrigin */
	public int eOrigin;
	public VROverlayIntersectionParams_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("vSource", "vDirection", "eOrigin");
	}
	public VROverlayIntersectionParams_t(HmdVector3_t vSource, HmdVector3_t vDirection, int eOrigin) {
		super();
		this.vSource = vSource;
		this.vDirection = vDirection;
		this.eOrigin = eOrigin;
	}
	public VROverlayIntersectionParams_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VROverlayIntersectionParams_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VROverlayIntersectionParams_t implements Structure.ByValue {
		
	};
}
