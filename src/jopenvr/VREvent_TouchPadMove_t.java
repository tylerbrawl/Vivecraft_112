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
public class VREvent_TouchPadMove_t extends AlignedStructure {
	public byte bFingerDown;
	public float flSecondsFingerDown;
	public float fValueXFirst;
	public float fValueYFirst;
	public float fValueXRaw;
	public float fValueYRaw;
	public VREvent_TouchPadMove_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bFingerDown", "flSecondsFingerDown", "fValueXFirst", "fValueYFirst", "fValueXRaw", "fValueYRaw");
	}
	public VREvent_TouchPadMove_t(byte bFingerDown, float flSecondsFingerDown, float fValueXFirst, float fValueYFirst, float fValueXRaw, float fValueYRaw) {
		super();
		this.bFingerDown = bFingerDown;
		this.flSecondsFingerDown = flSecondsFingerDown;
		this.fValueXFirst = fValueXFirst;
		this.fValueYFirst = fValueYFirst;
		this.fValueXRaw = fValueXRaw;
		this.fValueYRaw = fValueYRaw;
	}
	public VREvent_TouchPadMove_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VREvent_TouchPadMove_t implements Structure.ByReference {
		
	};
	public static class ByValue extends VREvent_TouchPadMove_t implements Structure.ByValue {
		
	};
}
