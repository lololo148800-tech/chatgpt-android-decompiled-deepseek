package p1016t3;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import livekit.org.webrtc.MediaStreamTrack;
import p138F8.vJO.anhfj;
import p165G9.C3024j;
import p479Td.AbstractC7360k;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: t3.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC19754D {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f62557a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f62558b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static int m20703a(String str, String str2) {
        C3024j c3024jM20705c;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (c3024jM20705c = m20705c(str2)) == null) {
                    return 0;
                }
                return c3024jM20705c.m3880c();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m20704b(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public static C3024j m20705c(String str) {
        Matcher matcher = f62558b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            Integer.parseInt(strGroup, 16);
            return new C3024j(strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m20706d(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20708f(String str) {
        return "image".equals(m20706d(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20709g(String str) {
        return "text".equals(m20706d(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m20710h(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(m20706d(str));
    }

    /* JADX INFO: renamed from: i */
    public static String m20711i(String str) {
        if (str == null) {
            return null;
        }
        String strM7787d = AbstractC7360k.m7787d(str);
        strM7787d.getClass();
        switch (strM7787d) {
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM7787d;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m20707e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(m20706d(str))) {
            return 1;
        }
        if (m20710h(str)) {
            return 2;
        }
        if (m20709g(str)) {
            return 3;
        }
        if (m20708f(str)) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if (anhfj.AoQYqtuPpU.equals(str)) {
                return 6;
            }
            ArrayList arrayList = f62557a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            throw AbstractC14376f.m15860z(0, arrayList);
        }
        return 5;
    }
}
