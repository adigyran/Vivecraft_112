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
public class VR_IVRScreenshots_FnTable extends AlignedStructure {
	public VR_IVRScreenshots_FnTable.RequestScreenshot_callback RequestScreenshot;
	public VR_IVRScreenshots_FnTable.HookScreenshot_callback HookScreenshot;
	public VR_IVRScreenshots_FnTable.GetScreenshotPropertyType_callback GetScreenshotPropertyType;
	public VR_IVRScreenshots_FnTable.GetScreenshotPropertyFilename_callback GetScreenshotPropertyFilename;
	public VR_IVRScreenshots_FnTable.UpdateScreenshotProgress_callback UpdateScreenshotProgress;
	public VR_IVRScreenshots_FnTable.TakeStereoScreenshot_callback TakeStereoScreenshot;
	public VR_IVRScreenshots_FnTable.SubmitScreenshot_callback SubmitScreenshot;
	public interface RequestScreenshot_callback extends Callback {
		int apply(IntByReference pOutScreenshotHandle, int type, Pointer pchPreviewFilename, Pointer pchVRFilename);
	};
	public interface HookScreenshot_callback extends Callback {
		int apply(IntByReference pSupportedTypes, int numTypes);
	};
	public interface GetScreenshotPropertyType_callback extends Callback {
		int apply(int screenshotHandle, IntByReference pError);
	};
	public interface GetScreenshotPropertyFilename_callback extends Callback {
		int apply(int screenshotHandle, int filenameType, Pointer pchFilename, int cchFilename, IntByReference pError);
	};
	public interface UpdateScreenshotProgress_callback extends Callback {
		int apply(int screenshotHandle, float flProgress);
	};
	public interface TakeStereoScreenshot_callback extends Callback {
		int apply(IntByReference pOutScreenshotHandle, Pointer pchPreviewFilename, Pointer pchVRFilename);
	};
	public interface SubmitScreenshot_callback extends Callback {
		int apply(int screenshotHandle, int type, Pointer pchSourcePreviewFilename, Pointer pchSourceVRFilename);
	};
	public VR_IVRScreenshots_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("RequestScreenshot", "HookScreenshot", "GetScreenshotPropertyType", "GetScreenshotPropertyFilename", "UpdateScreenshotProgress", "TakeStereoScreenshot", "SubmitScreenshot");
	}
	public VR_IVRScreenshots_FnTable(VR_IVRScreenshots_FnTable.RequestScreenshot_callback RequestScreenshot, VR_IVRScreenshots_FnTable.HookScreenshot_callback HookScreenshot, VR_IVRScreenshots_FnTable.GetScreenshotPropertyType_callback GetScreenshotPropertyType, VR_IVRScreenshots_FnTable.GetScreenshotPropertyFilename_callback GetScreenshotPropertyFilename, VR_IVRScreenshots_FnTable.UpdateScreenshotProgress_callback UpdateScreenshotProgress, VR_IVRScreenshots_FnTable.TakeStereoScreenshot_callback TakeStereoScreenshot, VR_IVRScreenshots_FnTable.SubmitScreenshot_callback SubmitScreenshot) {
		super();
		this.RequestScreenshot = RequestScreenshot;
		this.HookScreenshot = HookScreenshot;
		this.GetScreenshotPropertyType = GetScreenshotPropertyType;
		this.GetScreenshotPropertyFilename = GetScreenshotPropertyFilename;
		this.UpdateScreenshotProgress = UpdateScreenshotProgress;
		this.TakeStereoScreenshot = TakeStereoScreenshot;
		this.SubmitScreenshot = SubmitScreenshot;
	}
	public VR_IVRScreenshots_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRScreenshots_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRScreenshots_FnTable implements Structure.ByValue {
		
	};
}
