package jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRApplications_FnTable extends AlignedStructure {
	public VR_IVRApplications_FnTable.AddApplicationManifest_callback AddApplicationManifest;
	public VR_IVRApplications_FnTable.RemoveApplicationManifest_callback RemoveApplicationManifest;
	public VR_IVRApplications_FnTable.IsApplicationInstalled_callback IsApplicationInstalled;
	public VR_IVRApplications_FnTable.GetApplicationCount_callback GetApplicationCount;
	public VR_IVRApplications_FnTable.GetApplicationKeyByIndex_callback GetApplicationKeyByIndex;
	public VR_IVRApplications_FnTable.GetApplicationKeyByProcessId_callback GetApplicationKeyByProcessId;
	public VR_IVRApplications_FnTable.LaunchApplication_callback LaunchApplication;
	public VR_IVRApplications_FnTable.LaunchTemplateApplication_callback LaunchTemplateApplication;
	public VR_IVRApplications_FnTable.LaunchApplicationFromMimeType_callback LaunchApplicationFromMimeType;
	public VR_IVRApplications_FnTable.LaunchDashboardOverlay_callback LaunchDashboardOverlay;
	public VR_IVRApplications_FnTable.CancelApplicationLaunch_callback CancelApplicationLaunch;
	public VR_IVRApplications_FnTable.IdentifyApplication_callback IdentifyApplication;
	public VR_IVRApplications_FnTable.GetApplicationProcessId_callback GetApplicationProcessId;
	public VR_IVRApplications_FnTable.GetApplicationsErrorNameFromEnum_callback GetApplicationsErrorNameFromEnum;
	public VR_IVRApplications_FnTable.GetApplicationPropertyString_callback GetApplicationPropertyString;
	public VR_IVRApplications_FnTable.GetApplicationPropertyBool_callback GetApplicationPropertyBool;
	public VR_IVRApplications_FnTable.GetApplicationPropertyUint64_callback GetApplicationPropertyUint64;
	public VR_IVRApplications_FnTable.SetApplicationAutoLaunch_callback SetApplicationAutoLaunch;
	public VR_IVRApplications_FnTable.GetApplicationAutoLaunch_callback GetApplicationAutoLaunch;
	public VR_IVRApplications_FnTable.SetDefaultApplicationForMimeType_callback SetDefaultApplicationForMimeType;
	public VR_IVRApplications_FnTable.GetDefaultApplicationForMimeType_callback GetDefaultApplicationForMimeType;
	public VR_IVRApplications_FnTable.GetApplicationSupportedMimeTypes_callback GetApplicationSupportedMimeTypes;
	public VR_IVRApplications_FnTable.GetApplicationsThatSupportMimeType_callback GetApplicationsThatSupportMimeType;
	public VR_IVRApplications_FnTable.GetApplicationLaunchArguments_callback GetApplicationLaunchArguments;
	public VR_IVRApplications_FnTable.GetStartingApplication_callback GetStartingApplication;
	public VR_IVRApplications_FnTable.GetTransitionState_callback GetTransitionState;
	public VR_IVRApplications_FnTable.PerformApplicationPrelaunchCheck_callback PerformApplicationPrelaunchCheck;
	public VR_IVRApplications_FnTable.GetApplicationsTransitionStateNameFromEnum_callback GetApplicationsTransitionStateNameFromEnum;
	public VR_IVRApplications_FnTable.IsQuitUserPromptRequested_callback IsQuitUserPromptRequested;
	public VR_IVRApplications_FnTable.LaunchInternalProcess_callback LaunchInternalProcess;
	public interface AddApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath, byte bTemporary);
	};
	public interface RemoveApplicationManifest_callback extends Callback {
		int apply(Pointer pchApplicationManifestFullPath);
	};
	public interface IsApplicationInstalled_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface GetApplicationCount_callback extends Callback {
		int apply();
	};
	public interface GetApplicationKeyByIndex_callback extends Callback {
		int apply(int unApplicationIndex, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface GetApplicationKeyByProcessId_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface LaunchApplication_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface LaunchTemplateApplication_callback extends Callback {
		int apply(Pointer pchTemplateAppKey, Pointer pchNewAppKey, AppOverrideKeys_t pKeys, int unKeys);
	};
	public interface LaunchApplicationFromMimeType_callback extends Callback {
		int apply(Pointer pchMimeType, Pointer pchArgs);
	};
	public interface LaunchDashboardOverlay_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface CancelApplicationLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface IdentifyApplication_callback extends Callback {
		int apply(int unProcessId, Pointer pchAppKey);
	};
	public interface GetApplicationProcessId_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface GetApplicationsErrorNameFromEnum_callback extends Callback {
		Pointer apply(int error);
	};
	public interface GetApplicationPropertyString_callback extends Callback {
		int apply(Pointer pchAppKey, int eProperty, Pointer pchPropertyValueBuffer, int unPropertyValueBufferLen, IntByReference peError);
	};
	public interface GetApplicationPropertyBool_callback extends Callback {
		byte apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	public interface GetApplicationPropertyUint64_callback extends Callback {
		long apply(Pointer pchAppKey, int eProperty, IntByReference peError);
	};
	public interface SetApplicationAutoLaunch_callback extends Callback {
		int apply(Pointer pchAppKey, byte bAutoLaunch);
	};
	public interface GetApplicationAutoLaunch_callback extends Callback {
		byte apply(Pointer pchAppKey);
	};
	public interface SetDefaultApplicationForMimeType_callback extends Callback {
		int apply(Pointer pchAppKey, Pointer pchMimeType);
	};
	public interface GetDefaultApplicationForMimeType_callback extends Callback {
		byte apply(Pointer pchMimeType, Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface GetApplicationSupportedMimeTypes_callback extends Callback {
		byte apply(Pointer pchAppKey, Pointer pchMimeTypesBuffer, int unMimeTypesBuffer);
	};
	public interface GetApplicationsThatSupportMimeType_callback extends Callback {
		int apply(Pointer pchMimeType, Pointer pchAppKeysThatSupportBuffer, int unAppKeysThatSupportBuffer);
	};
	public interface GetApplicationLaunchArguments_callback extends Callback {
		int apply(int unHandle, Pointer pchArgs, int unArgs);
	};
	public interface GetStartingApplication_callback extends Callback {
		int apply(Pointer pchAppKeyBuffer, int unAppKeyBufferLen);
	};
	public interface GetTransitionState_callback extends Callback {
		int apply();
	};
	public interface PerformApplicationPrelaunchCheck_callback extends Callback {
		int apply(Pointer pchAppKey);
	};
	public interface GetApplicationsTransitionStateNameFromEnum_callback extends Callback {
		Pointer apply(int state);
	};
	public interface IsQuitUserPromptRequested_callback extends Callback {
		byte apply();
	};
	public interface LaunchInternalProcess_callback extends Callback {
		int apply(Pointer pchBinaryPath, Pointer pchArguments, Pointer pchWorkingDirectory);
	};
	public VR_IVRApplications_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("AddApplicationManifest", "RemoveApplicationManifest", "IsApplicationInstalled", "GetApplicationCount", "GetApplicationKeyByIndex", "GetApplicationKeyByProcessId", "LaunchApplication", "LaunchTemplateApplication", "LaunchApplicationFromMimeType", "LaunchDashboardOverlay", "CancelApplicationLaunch", "IdentifyApplication", "GetApplicationProcessId", "GetApplicationsErrorNameFromEnum", "GetApplicationPropertyString", "GetApplicationPropertyBool", "GetApplicationPropertyUint64", "SetApplicationAutoLaunch", "GetApplicationAutoLaunch", "SetDefaultApplicationForMimeType", "GetDefaultApplicationForMimeType", "GetApplicationSupportedMimeTypes", "GetApplicationsThatSupportMimeType", "GetApplicationLaunchArguments", "GetStartingApplication", "GetTransitionState", "PerformApplicationPrelaunchCheck", "GetApplicationsTransitionStateNameFromEnum", "IsQuitUserPromptRequested", "LaunchInternalProcess");
	}
	public VR_IVRApplications_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRApplications_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRApplications_FnTable implements Structure.ByValue {
		
	};
}
