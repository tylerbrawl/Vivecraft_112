package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRChaperoneSetup_FnTable extends AlignedStructure {
	public VR_IVRChaperoneSetup_FnTable.CommitWorkingCopy_callback CommitWorkingCopy;
	public VR_IVRChaperoneSetup_FnTable.RevertWorkingCopy_callback RevertWorkingCopy;
	public VR_IVRChaperoneSetup_FnTable.GetWorkingPlayAreaSize_callback GetWorkingPlayAreaSize;
	public VR_IVRChaperoneSetup_FnTable.GetWorkingPlayAreaRect_callback GetWorkingPlayAreaRect;
	public VR_IVRChaperoneSetup_FnTable.GetWorkingCollisionBoundsInfo_callback GetWorkingCollisionBoundsInfo;
	public VR_IVRChaperoneSetup_FnTable.GetLiveCollisionBoundsInfo_callback GetLiveCollisionBoundsInfo;
	public VR_IVRChaperoneSetup_FnTable.GetWorkingSeatedZeroPoseToRawTrackingPose_callback GetWorkingSeatedZeroPoseToRawTrackingPose;
	public VR_IVRChaperoneSetup_FnTable.GetWorkingStandingZeroPoseToRawTrackingPose_callback GetWorkingStandingZeroPoseToRawTrackingPose;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingPlayAreaSize_callback SetWorkingPlayAreaSize;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingCollisionBoundsInfo_callback SetWorkingCollisionBoundsInfo;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingSeatedZeroPoseToRawTrackingPose_callback SetWorkingSeatedZeroPoseToRawTrackingPose;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingStandingZeroPoseToRawTrackingPose_callback SetWorkingStandingZeroPoseToRawTrackingPose;
	public VR_IVRChaperoneSetup_FnTable.ReloadFromDisk_callback ReloadFromDisk;
	public VR_IVRChaperoneSetup_FnTable.GetLiveSeatedZeroPoseToRawTrackingPose_callback GetLiveSeatedZeroPoseToRawTrackingPose;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingCollisionBoundsTagsInfo_callback SetWorkingCollisionBoundsTagsInfo;
	public VR_IVRChaperoneSetup_FnTable.GetLiveCollisionBoundsTagsInfo_callback GetLiveCollisionBoundsTagsInfo;
	public VR_IVRChaperoneSetup_FnTable.SetWorkingPhysicalBoundsInfo_callback SetWorkingPhysicalBoundsInfo;
	public VR_IVRChaperoneSetup_FnTable.GetLivePhysicalBoundsInfo_callback GetLivePhysicalBoundsInfo;
	public VR_IVRChaperoneSetup_FnTable.ExportLiveToBuffer_callback ExportLiveToBuffer;
	public VR_IVRChaperoneSetup_FnTable.ImportFromBufferToWorking_callback ImportFromBufferToWorking;
	public interface CommitWorkingCopy_callback extends Callback {
		byte apply(int configFile);
	};
	public interface RevertWorkingCopy_callback extends Callback {
		void apply();
	};
	public interface GetWorkingPlayAreaSize_callback extends Callback {
		byte apply(FloatByReference pSizeX, FloatByReference pSizeZ);
	};
	public interface GetWorkingPlayAreaRect_callback extends Callback {
		byte apply(HmdQuad_t rect);
	};
	public interface GetWorkingCollisionBoundsInfo_callback extends Callback {
		byte apply(HmdQuad_t pQuadsBuffer, IntByReference punQuadsCount);
	};
	public interface GetLiveCollisionBoundsInfo_callback extends Callback {
		byte apply(HmdQuad_t pQuadsBuffer, IntByReference punQuadsCount);
	};
	public interface GetWorkingSeatedZeroPoseToRawTrackingPose_callback extends Callback {
		byte apply(HmdMatrix34_t pmatSeatedZeroPoseToRawTrackingPose);
	};
	public interface GetWorkingStandingZeroPoseToRawTrackingPose_callback extends Callback {
		byte apply(HmdMatrix34_t pmatStandingZeroPoseToRawTrackingPose);
	};
	public interface SetWorkingPlayAreaSize_callback extends Callback {
		void apply(float sizeX, float sizeZ);
	};
	public interface SetWorkingCollisionBoundsInfo_callback extends Callback {
		void apply(HmdQuad_t pQuadsBuffer, int unQuadsCount);
	};
	public interface SetWorkingSeatedZeroPoseToRawTrackingPose_callback extends Callback {
		void apply(HmdMatrix34_t pMatSeatedZeroPoseToRawTrackingPose);
	};
	public interface SetWorkingStandingZeroPoseToRawTrackingPose_callback extends Callback {
		void apply(HmdMatrix34_t pMatStandingZeroPoseToRawTrackingPose);
	};
	public interface ReloadFromDisk_callback extends Callback {
		void apply(int configFile);
	};
	public interface GetLiveSeatedZeroPoseToRawTrackingPose_callback extends Callback {
		byte apply(HmdMatrix34_t pmatSeatedZeroPoseToRawTrackingPose);
	};
	public interface SetWorkingCollisionBoundsTagsInfo_callback extends Callback {
		void apply(Pointer pTagsBuffer, int unTagCount);
	};
	public interface GetLiveCollisionBoundsTagsInfo_callback extends Callback {
		byte apply(Pointer pTagsBuffer, IntByReference punTagCount);
	};
	public interface SetWorkingPhysicalBoundsInfo_callback extends Callback {
		byte apply(HmdQuad_t pQuadsBuffer, int unQuadsCount);
	};
	public interface GetLivePhysicalBoundsInfo_callback extends Callback {
		byte apply(HmdQuad_t pQuadsBuffer, IntByReference punQuadsCount);
	};
	public interface ExportLiveToBuffer_callback extends Callback {
		byte apply(Pointer pBuffer, IntByReference pnBufferLength);
	};
	public interface ImportFromBufferToWorking_callback extends Callback {
		byte apply(Pointer pBuffer, int nImportFlags);
	};
	public VR_IVRChaperoneSetup_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("CommitWorkingCopy", "RevertWorkingCopy", "GetWorkingPlayAreaSize", "GetWorkingPlayAreaRect", "GetWorkingCollisionBoundsInfo", "GetLiveCollisionBoundsInfo", "GetWorkingSeatedZeroPoseToRawTrackingPose", "GetWorkingStandingZeroPoseToRawTrackingPose", "SetWorkingPlayAreaSize", "SetWorkingCollisionBoundsInfo", "SetWorkingSeatedZeroPoseToRawTrackingPose", "SetWorkingStandingZeroPoseToRawTrackingPose", "ReloadFromDisk", "GetLiveSeatedZeroPoseToRawTrackingPose", "SetWorkingCollisionBoundsTagsInfo", "GetLiveCollisionBoundsTagsInfo", "SetWorkingPhysicalBoundsInfo", "GetLivePhysicalBoundsInfo", "ExportLiveToBuffer", "ImportFromBufferToWorking");
	}
	public VR_IVRChaperoneSetup_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRChaperoneSetup_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRChaperoneSetup_FnTable implements Structure.ByValue {
		
	};
}
