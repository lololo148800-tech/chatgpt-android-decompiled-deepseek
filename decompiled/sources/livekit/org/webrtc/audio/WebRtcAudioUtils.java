package livekit.org.webrtc.audio;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import livekit.org.webrtc.Logging;
import p001A.AbstractC0010F;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes2.dex */
public final class WebRtcAudioUtils {
    private static final String TAG = "WebRtcAudioUtilsExternal";

    public static String audioEncodingToString(int i10) {
        if (i10 == 0) {
            return "INVALID";
        }
        switch (i10) {
            case 2:
                return "PCM_16BIT";
            case 3:
                return "PCM_8BIT";
            case 4:
                return "PCM_FLOAT";
            case 5:
            case 6:
                return "AC3";
            case 7:
                return "DTS";
            case 8:
                return "DTS_HD";
            case 9:
                return "MP3";
            default:
                return AbstractC10763a.m11048f(i10, "Invalid encoding: ");
        }
    }

    public static String audioSourceToString(int i10) {
        switch (i10) {
            case 0:
                return "DEFAULT";
            case 1:
                return "MIC";
            case 2:
                return "VOICE_UPLINK";
            case 3:
                return "VOICE_DOWNLINK";
            case 4:
                return "VOICE_CALL";
            case 5:
                return "CAMCORDER";
            case 6:
                return "VOICE_RECOGNITION";
            case 7:
                return "VOICE_COMMUNICATION";
            case 8:
            default:
                return "INVALID";
            case 9:
                return "UNPROCESSED";
            case 10:
                return "VOICE_PERFORMANCE";
        }
    }

    public static String channelMaskToString(int i10) {
        if (i10 != 12) {
            return i10 != 16 ? "INVALID" : "IN_MONO";
        }
        return "IN_STEREO";
    }

    public static String deviceTypeToString(int i10) {
        switch (i10) {
            case 0:
                return "TYPE_UNKNOWN";
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 24:
                return "TYPE_BUILTIN_SPEAKER_SAFE";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
            case 26:
                return "TYPE_BLE_HEADSET";
            case 27:
                return "TYPE_BLE_SPEAKER";
            case 28:
            default:
                return AbstractC0010F.m19c(i10, "TYPE_UNKNOWN(", Separators.RPAREN);
            case 29:
                return "TYPE_HDMI_EARC";
            case 30:
                return "TYPE_BLE_BROADCAST";
            case 31:
                return "TYPE_DOCK_ANALOG";
        }
    }

    public static String getThreadInfo() {
        Thread threadCurrentThread = Thread.currentThread();
        return "@[name=" + threadCurrentThread.getName() + ", id=" + threadCurrentThread.getId() + "]";
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.m18742d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb2 = new StringBuilder("  ");
            sb2.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb2.append("channels=");
                sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb2.append("encodings=");
                sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb2.append("sample rates=");
                sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb2.append(", ");
            }
            sb2.append("id=");
            sb2.append(audioDeviceInfo.getId());
            Logging.m18742d(str, sb2.toString());
        }
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        Logging.m18742d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.m18742d(str, "Audio State: ");
        boolean zIsVolumeFixed = audioManager.isVolumeFixed();
        Logging.m18742d(str, "  fixed volume=" + zIsVolumeFixed);
        if (zIsVolumeFixed) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + streamTypeToString(i11) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i11));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i11));
            sb2.append(", muted=");
            sb2.append(audioManager.isStreamMute(i11));
            Logging.m18742d(str, sb2.toString());
        }
    }

    public static String modeToString(int i10) {
        if (i10 == 0) {
            return "MODE_NORMAL";
        }
        if (i10 == 1) {
            return "MODE_RINGTONE";
        }
        if (i10 != 2) {
            return i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION";
        }
        return "MODE_IN_CALL";
    }

    public static boolean runningOnEmulator() {
        String str = Build.HARDWARE;
        return str.equals("goldfish") || str.equals("ranchu");
    }

    private static String streamTypeToString(int i10) {
        if (i10 == 0) {
            return "STREAM_VOICE_CALL";
        }
        if (i10 == 1) {
            return "STREAM_SYSTEM";
        }
        if (i10 == 2) {
            return "STREAM_RING";
        }
        if (i10 == 3) {
            return "STREAM_MUSIC";
        }
        if (i10 != 4) {
            return i10 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION";
        }
        return "STREAM_ALARM";
    }

    private static void logDeviceInfo(String str) {
        int i10 = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        StringBuilder sb2 = new StringBuilder("Android SDK: ");
        sb2.append(i10);
        sb2.append(", Release: ");
        sb2.append(str2);
        sb2.append(", Brand: ");
        AbstractC10763a.m11067y(sb2, str3, ", Device: ", str4, ", Id: ");
        AbstractC10763a.m11067y(sb2, str5, ", Hardware: ", str6, ", Manufacturer: ");
        AbstractC10763a.m11067y(sb2, str7, ", Model: ", str8, sVDIzpC.amqsXRO);
        sb2.append(str9);
        Logging.m18742d(str, sb2.toString());
    }
}
