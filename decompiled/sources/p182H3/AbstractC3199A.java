package p182H3;

import android.gov.nist.core.Separators;
import android.media.MediaCodecInfo;
import android.util.Pair;
import bb.AbstractC11278C;
import bb.C11294T;
import bb.C11333z;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import livekit.org.webrtc.MediaStreamTrack;
import livekit.org.webrtc.WebrtcBuildVersion;
import p003A1.AbstractC0168G;
import p011A9.p012Ra.ahZQMZ;
import p080D0.C1817m0;
import p1016t3.AbstractC19754D;
import p1016t3.C19781h;
import p1016t3.C19788o;
import p1071w0.AbstractC20734X;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p174Gk.uSfJ.HpucjswO;
import p451Sb.C7102a;
import p479Td.AbstractC7360k;
import p826j6.C16137F;

/* JADX INFO: renamed from: H3.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3199A {

    /* JADX INFO: renamed from: a */
    public static final Pattern f9651a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final HashMap f9652b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static int f9653c = -1;

    /* JADX INFO: renamed from: a */
    public static void m4044a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC20817s.f66106a < 26 && AbstractC20817s.f66107b.equals("R9") && arrayList.size() == 1 && ((C3213n) arrayList.get(0)).f9703a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C3213n.m4076h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C1817m0(new C3221v(1), 1));
        }
        int i10 = AbstractC20817s.f66106a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((C3213n) arrayList.get(0)).f9703a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C1817m0(new C3221v(2), 1));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C3213n) arrayList.get(0)).f9703a)) {
            return;
        }
        arrayList.add((C3213n) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m4045b(C19788o c19788o) {
        Pair pairM4047d;
        if ("audio/eac3-joc".equals(c19788o.f62752m)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c19788o.f62752m) || (pairM4047d = m4047d(c19788o)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM4047d.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        if (iIntValue == 1024) {
            return "video/av01";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m4046c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List m4048e(String str, boolean z6, boolean z10) {
        try {
            C3222w c3222w = new C3222w(str, z6, z10);
            HashMap map = f9652b;
            List list = (List) map.get(c3222w);
            if (list != null) {
                return list;
            }
            int i10 = AbstractC20817s.f66106a;
            ArrayList arrayListM4049f = m4049f(c3222w, i10 >= 21 ? new C16137F(z6, z10) : new C7102a(6));
            if (z6 && arrayListM4049f.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListM4049f = m4049f(c3222w, new C7102a(6));
                if (!arrayListM4049f.isEmpty()) {
                    AbstractC20800b.m21332t("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C3213n) arrayListM4049f.get(0)).f9703a);
                }
            }
            m4044a(str, arrayListM4049f);
            AbstractC11278C abstractC11278CM12691t = AbstractC11278C.m12691t(arrayListM4049f);
            map.put(c3222w, abstractC11278CM12691t);
            return abstractC11278CM12691t;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX INFO: renamed from: f */
    public static ArrayList m4049f(C3222w c3222w, InterfaceC3224y interfaceC3224y) throws C3223x {
        String strM4046c;
        String str;
        String str2;
        int i10;
        boolean z6;
        boolean z10;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        String str3;
        C3222w c3222w2 = c3222w;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = c3222w2.f9788a;
            int iMo4118o = interfaceC3224y.mo4118o();
            boolean zMo4119p = interfaceC3224y.mo4119p();
            int i11 = 0;
            while (i11 < iMo4118o) {
                MediaCodecInfo mediaCodecInfoMo4115b = interfaceC3224y.mo4115b(i11);
                int i12 = AbstractC20817s.f66106a;
                if (i12 < 29 || !mediaCodecInfoMo4115b.isAlias()) {
                    String name = mediaCodecInfoMo4115b.getName();
                    if (m4051h(mediaCodecInfoMo4115b, name, zMo4119p, str4) && (strM4046c = m4046c(mediaCodecInfoMo4115b, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo4115b.getCapabilitiesForType(strM4046c);
                            boolean zMo4116g = interfaceC3224y.mo4116g("tunneled-playback", strM4046c, capabilitiesForType);
                            boolean zMo4117k = interfaceC3224y.mo4117k("tunneled-playback", capabilitiesForType);
                            boolean z11 = c3222w2.f9790c;
                            if ((z11 || !zMo4117k) && (!z11 || zMo4116g)) {
                                boolean zMo4116g2 = interfaceC3224y.mo4116g("secure-playback", strM4046c, capabilitiesForType);
                                boolean zMo4117k2 = interfaceC3224y.mo4117k("secure-playback", capabilitiesForType);
                                boolean z12 = c3222w2.f9789b;
                                if ((z12 || !zMo4117k2) && (!z12 || zMo4116g2)) {
                                    if (i12 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoMo4115b.isHardwareAccelerated();
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                        zIsHardwareAccelerated = !m4052i(mediaCodecInfoMo4115b, str4);
                                    }
                                    boolean zM4052i = m4052i(mediaCodecInfoMo4115b, str4);
                                    if (i12 >= 29) {
                                        zIsVendor = mediaCodecInfoMo4115b.isVendor();
                                    } else {
                                        String strM7787d = AbstractC7360k.m7787d(mediaCodecInfoMo4115b.getName());
                                        zIsVendor = (strM7787d.startsWith("omx.google.") || strM7787d.startsWith("c2.android.") || strM7787d.startsWith("c2.google.")) ? false : z10;
                                    }
                                    if (!(zMo4119p && z12 == zMo4116g2) && (zMo4119p || z12)) {
                                        str = strM4046c;
                                        str3 = name;
                                        i10 = i11;
                                        z6 = zMo4119p;
                                        if (!z6 && zMo4116g2) {
                                            StringBuilder sb2 = new StringBuilder();
                                            try {
                                                sb2.append(str3);
                                                sb2.append(".secure");
                                                str2 = str3;
                                                try {
                                                    arrayList.add(C3213n.m4076h(sb2.toString(), str4, str, capabilitiesForType, zIsHardwareAccelerated, zM4052i, zIsVendor, true));
                                                    return arrayList;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    if (AbstractC20817s.f66106a <= 23) {
                                                    }
                                                    AbstractC20800b.m21324l("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + Separators.RPAREN);
                                                    throw e;
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str = strM4046c;
                                        str3 = name;
                                        i10 = i11;
                                        z6 = zMo4119p;
                                        try {
                                            arrayList.add(C3213n.m4076h(name, str4, strM4046c, capabilitiesForType, zIsHardwareAccelerated, zM4052i, zIsVendor, false));
                                        } catch (Exception e12) {
                                            e = e12;
                                            str2 = str3;
                                            if (AbstractC20817s.f66106a <= 23 || arrayList.isEmpty()) {
                                                AbstractC20800b.m21324l("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + Separators.RPAREN);
                                                throw e;
                                            }
                                            AbstractC20800b.m21324l("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                } else {
                                    i10 = i11;
                                    z6 = zMo4119p;
                                }
                            } else {
                                i10 = i11;
                                z6 = zMo4119p;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            str = strM4046c;
                            str2 = name;
                            i10 = i11;
                            z6 = zMo4119p;
                        }
                    } else {
                        i10 = i11;
                        z6 = zMo4119p;
                    }
                } else {
                    i10 = i11;
                    z6 = zMo4119p;
                }
                i11 = i10 + 1;
                c3222w2 = c3222w;
                zMo4119p = z6;
            }
            return arrayList;
        } catch (Exception e14) {
            throw new C3223x("Failed to query underlying media codecs", e14);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C11294T m4050g(C3221v c3221v, C19788o c19788o, boolean z6, boolean z10) {
        List listM4048e;
        String str = c19788o.f62752m;
        c3221v.getClass();
        List listM4048e2 = m4048e(str, z6, z10);
        String strM4045b = m4045b(c19788o);
        if (strM4045b == null) {
            listM4048e = C11294T.f34185q0;
        } else {
            c3221v.getClass();
            listM4048e = m4048e(strM4045b, z6, z10);
        }
        C11333z c11333zM12690s = AbstractC11278C.m12690s();
        c11333zM12690s.m12764d(listM4048e2);
        c11333zM12690s.m12764d(listM4048e);
        return c11333zM12690s.m12768j();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4052i(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC20817s.f66106a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(AbstractC19754D.m20706d(str))) {
            return true;
        }
        String strM7787d = AbstractC7360k.m7787d(mediaCodecInfo.getName());
        if (strM7787d.startsWith("arc.")) {
            return false;
        }
        if (strM7787d.startsWith("omx.google.") || strM7787d.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strM7787d.startsWith("omx.sec.") && strM7787d.contains(".sw.")) || strM7787d.equals("omx.qcom.video.decoder.hevcswvdec") || strM7787d.startsWith("c2.android.") || strM7787d.startsWith("c2.google.")) {
            return true;
        }
        return (strM7787d.startsWith("omx.") || strM7787d.startsWith("c2.")) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static int m4053j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f9653c == -1) {
            int iMax = 0;
            List listM4048e = m4048e("video/avc", false, false);
            C3213n c3213n = listM4048e.isEmpty() ? null : (C3213n) listM4048e.get(0);
            if (c3213n != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c3213n.f9706d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, AbstractC20817s.f66106a >= 21 ? 345600 : 172800);
            }
            f9653c = iMax;
        }
        return f9653c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x023a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0311  */
    /* JADX WARN: Code duplicated, block: B:243:0x0317  */
    /* JADX WARN: Code duplicated, block: B:297:0x03db  */
    /* JADX WARN: Code duplicated, block: B:300:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:471:0x066b  */
    /* JADX WARN: Code duplicated, block: B:472:0x0672  */
    /* JADX WARN: Code duplicated, block: B:473:0x0675  */
    /* JADX WARN: Code duplicated, block: B:474:0x0678  */
    /* JADX WARN: Code duplicated, block: B:475:0x067b  */
    /* JADX WARN: Code duplicated, block: B:476:0x067e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0681  */
    /* JADX WARN: Code duplicated, block: B:478:0x0684  */
    /* JADX WARN: Code duplicated, block: B:479:0x0688  */
    /* JADX WARN: Code duplicated, block: B:480:0x0689 A[PHI: r6
      0x0689: PHI (r6v30 int) = 
      (r6v0 int)
      (r6v27 int)
      (r6v28 int)
      (r6v29 int)
      (r6v32 int)
      (r6v33 int)
      (r6v34 int)
      (r6v35 int)
      (r6v36 int)
      (r6v37 int)
      (r6v38 int)
      (r6v39 int)
      (r6v40 int)
      (r6v41 int)
      (r6v42 int)
     binds: [B:472:0x0672, B:493:0x06aa, B:492:0x06a8, B:491:0x06a6, B:490:0x06a3, B:489:0x06a0, B:488:0x069d, B:487:0x069a, B:486:0x0697, B:485:0x0695, B:484:0x0692, B:483:0x068f, B:482:0x068d, B:481:0x068b, B:479:0x0688] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:481:0x068b  */
    /* JADX WARN: Code duplicated, block: B:482:0x068d  */
    /* JADX WARN: Code duplicated, block: B:483:0x068f  */
    /* JADX WARN: Code duplicated, block: B:484:0x0692  */
    /* JADX WARN: Code duplicated, block: B:485:0x0695  */
    /* JADX WARN: Code duplicated, block: B:486:0x0697  */
    /* JADX WARN: Code duplicated, block: B:487:0x069a  */
    /* JADX WARN: Code duplicated, block: B:488:0x069d  */
    /* JADX WARN: Code duplicated, block: B:489:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:490:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:491:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:492:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:493:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:495:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:496:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x013e  */
    /* JADX INFO: renamed from: d */
    public static Pair m4047d(C19788o c19788o) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer num;
        int i19;
        int i20;
        int i21;
        byte b;
        char c9;
        Integer num2;
        int i22;
        byte b10;
        Integer num3;
        String str = ahZQMZ.RHN;
        Pattern pattern = f9651a;
        int i23 = 16;
        String str2 = c19788o.f62749j;
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(c19788o.f62752m);
        String str3 = c19788o.f62749j;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                AbstractC0168G.m508C("Ignoring malformed Dolby Vision codec string: ", str3, "MediaCodecUtil");
                return null;
            }
            Matcher matcher = pattern.matcher(strArrSplit[1]);
            if (!matcher.matches()) {
                AbstractC0168G.m508C("Ignoring malformed Dolby Vision codec string: ", str3, "MediaCodecUtil");
                return null;
            }
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                switch (strGroup.hashCode()) {
                    case 1536:
                        if (!strGroup.equals("00")) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case 1537:
                        if (!strGroup.equals("01")) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case 1538:
                        if (!strGroup.equals("02")) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case 1539:
                        if (!strGroup.equals("03")) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case 1540:
                        if (!strGroup.equals(str)) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case 1541:
                        if (!strGroup.equals("05")) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case 1542:
                        if (!strGroup.equals(WebrtcBuildVersion.webrtc_commit)) {
                            b = -1;
                        } else {
                            b = 6;
                        }
                        break;
                    case 1543:
                        if (!strGroup.equals("07")) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case 1544:
                        if (!strGroup.equals("08")) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case 1545:
                        if (!strGroup.equals("09")) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case 1567:
                        if (!strGroup.equals("10")) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        c9 = 2;
                        num2 = 1;
                        break;
                    case 1:
                        c9 = 2;
                        num2 = 2;
                        break;
                    case 2:
                        i22 = 4;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 3:
                        i22 = 8;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 4:
                        i22 = 16;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 5:
                        i22 = 32;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 6:
                        i22 = 64;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 7:
                        i22 = 128;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 8:
                        i22 = 256;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 9:
                        i22 = 512;
                        num2 = i22;
                        c9 = 2;
                        break;
                    case 10:
                        i22 = 1024;
                        num2 = i22;
                        c9 = 2;
                        break;
                    default:
                        num2 = null;
                        c9 = 2;
                        break;
                }
            } else {
                num2 = null;
                c9 = 2;
            }
            if (num2 == null) {
                AbstractC0168G.m508C("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            String str4 = strArrSplit[c9];
            if (str4 != null) {
                switch (str4.hashCode()) {
                    case 1537:
                        if (!str4.equals("01")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 1538:
                        if (!str4.equals("02")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1539:
                        if (!str4.equals("03")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 1540:
                        if (!str4.equals(str)) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 1541:
                        if (!str4.equals("05")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 1542:
                        if (!str4.equals(WebrtcBuildVersion.webrtc_commit)) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case 1543:
                        if (!str4.equals("07")) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case 1544:
                        if (!str4.equals("08")) {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case 1545:
                        if (!str4.equals("09")) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 1567:
                        if (!str4.equals("10")) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1568:
                        if (!str4.equals("11")) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    case 1569:
                        if (!str4.equals("12")) {
                            b10 = -1;
                        } else {
                            b10 = 11;
                        }
                        break;
                    case 1570:
                        if (!str4.equals("13")) {
                            b10 = -1;
                        } else {
                            b10 = 12;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        num3 = 1;
                        break;
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = 16;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case 8:
                        num3 = 256;
                        break;
                    case 9:
                        num3 = 512;
                        break;
                    case 10:
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case 12:
                        num3 = 4096;
                        break;
                    default:
                        num3 = null;
                        break;
                }
            } else {
                num3 = null;
            }
            if (num3 != null) {
                return new Pair(num2, num3);
            }
            AbstractC0168G.m508C("Unknown Dolby Vision level string: ", str4, "MediaCodecUtil");
            return null;
        }
        String str5 = strArrSplit[0];
        str5.getClass();
        switch (str5) {
            case "av01":
                if (strArrSplit.length < 4) {
                    AbstractC0168G.m508C("Ignoring malformed AV1 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i24 = Integer.parseInt(strArrSplit[1]);
                    int i25 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i26 = Integer.parseInt(strArrSplit[3]);
                    if (i24 != 0) {
                        AbstractC20734X.m21224A(i24, "Unknown AV1 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i26 != 8 && i26 != 10) {
                        AbstractC20734X.m21224A(i26, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i26 == 8) {
                        i10 = 1;
                    } else {
                        C19781h c19781h = c19788o.f62765z;
                        i10 = (c19781h == null || !(c19781h.f62678d != null || (i11 = c19781h.f62677c) == 7 || i11 == 6)) ? 2 : 4096;
                    }
                    switch (i25) {
                        case 0:
                            i23 = 1;
                            i12 = -1;
                            break;
                        case 1:
                            i23 = 2;
                            i12 = -1;
                            break;
                        case 2:
                            i23 = 4;
                            i12 = -1;
                            break;
                        case 3:
                            i23 = 8;
                            i12 = -1;
                            break;
                        case 4:
                            i12 = -1;
                            break;
                        case 5:
                            i23 = 32;
                            i12 = -1;
                            break;
                        case 6:
                            i23 = 64;
                            i12 = -1;
                            break;
                        case 7:
                            i23 = 128;
                            i12 = -1;
                            break;
                        case 8:
                            i23 = 256;
                            i12 = -1;
                            break;
                        case 9:
                            i23 = 512;
                            i12 = -1;
                            break;
                        case 10:
                            i23 = 1024;
                            i12 = -1;
                            break;
                        case 11:
                            i23 = 2048;
                            i12 = -1;
                            break;
                        case 12:
                            i23 = 4096;
                            i12 = -1;
                            break;
                        case 13:
                            i12 = -1;
                            i23 = 8192;
                            break;
                        case 14:
                            i12 = -1;
                            i23 = 16384;
                            break;
                        case 15:
                            i23 = 32768;
                            i12 = -1;
                            break;
                        case 16:
                            i12 = -1;
                            i23 = 65536;
                            break;
                        case 17:
                            i23 = 131072;
                            i12 = -1;
                            break;
                        case 18:
                            i23 = 262144;
                            i12 = -1;
                            break;
                        case 19:
                            i23 = 524288;
                            i12 = -1;
                            break;
                        case 20:
                            i23 = 1048576;
                            i12 = -1;
                            break;
                        case 21:
                            i23 = 2097152;
                            i12 = -1;
                            break;
                        case 22:
                            i23 = 4194304;
                            i12 = -1;
                            break;
                        case 23:
                            i23 = 8388608;
                            i12 = -1;
                            break;
                        default:
                            i12 = -1;
                            i23 = -1;
                            break;
                    }
                    if (i23 != i12) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i23));
                    }
                    AbstractC20734X.m21224A(i25, "Unknown AV1 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused) {
                    AbstractC0168G.m508C("Ignoring malformed AV1 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    AbstractC0168G.m508C("Ignoring malformed AVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i13 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i14 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            AbstractC20800b.m21332t("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str3);
                            return null;
                        }
                        i13 = Integer.parseInt(strArrSplit[1]);
                        i14 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i13 != 66) {
                        if (i13 == 77) {
                            i16 = -1;
                            i15 = 2;
                        } else if (i13 == 88) {
                            i15 = 4;
                        } else if (i13 == 100) {
                            i15 = 8;
                        } else if (i13 == 110) {
                            i15 = 16;
                        } else if (i13 == 122) {
                            i15 = 32;
                        } else if (i13 != 244) {
                            i16 = -1;
                            i15 = -1;
                        } else {
                            i15 = 64;
                        }
                        if (i15 == i16) {
                            AbstractC20734X.m21224A(i13, "Unknown AVC profile: ", "MediaCodecUtil");
                            return null;
                        }
                        switch (i14) {
                            case 10:
                                i23 = 1;
                                i17 = -1;
                                break;
                            case 11:
                                i23 = 4;
                                i17 = -1;
                                break;
                            case 12:
                                i23 = 8;
                                i17 = -1;
                                break;
                            case 13:
                                i17 = -1;
                                break;
                            default:
                                switch (i14) {
                                    case 20:
                                        i23 = 32;
                                        i17 = -1;
                                        break;
                                    case 21:
                                        i23 = 64;
                                        i17 = -1;
                                        break;
                                    case 22:
                                        i23 = 128;
                                        i17 = -1;
                                        break;
                                    default:
                                        switch (i14) {
                                            case 30:
                                                i23 = 256;
                                                i17 = -1;
                                                break;
                                            case 31:
                                                i23 = 512;
                                                i17 = -1;
                                                break;
                                            case 32:
                                                i23 = 1024;
                                                i17 = -1;
                                                break;
                                            default:
                                                switch (i14) {
                                                    case 40:
                                                        i23 = 2048;
                                                        i17 = -1;
                                                        break;
                                                    case 41:
                                                        i23 = 4096;
                                                        i17 = -1;
                                                        break;
                                                    case 42:
                                                        i23 = 8192;
                                                        i17 = -1;
                                                        break;
                                                    default:
                                                        switch (i14) {
                                                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                                                i23 = 16384;
                                                                i17 = -1;
                                                                break;
                                                            case 51:
                                                                i23 = 32768;
                                                                i17 = -1;
                                                                break;
                                                            case 52:
                                                                i17 = -1;
                                                                i23 = 65536;
                                                                break;
                                                            default:
                                                                i17 = -1;
                                                                i23 = -1;
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        if (i23 == i17) {
                            return new Pair(Integer.valueOf(i15), Integer.valueOf(i23));
                        }
                        AbstractC20734X.m21224A(i14, "Unknown AVC level: ", "MediaCodecUtil");
                        return null;
                    }
                    i15 = 1;
                    i16 = -1;
                    if (i15 == i16) {
                        AbstractC20734X.m21224A(i13, "Unknown AVC profile: ", "MediaCodecUtil");
                        return null;
                    }
                    switch (i14) {
                        case 10:
                            i23 = 1;
                            i17 = -1;
                            break;
                        case 11:
                            i23 = 4;
                            i17 = -1;
                            break;
                        case 12:
                            i23 = 8;
                            i17 = -1;
                            break;
                        case 13:
                            i17 = -1;
                            break;
                        default:
                            switch (i14) {
                                case 20:
                                    i23 = 32;
                                    i17 = -1;
                                    break;
                                case 21:
                                    i23 = 64;
                                    i17 = -1;
                                    break;
                                case 22:
                                    i23 = 128;
                                    i17 = -1;
                                    break;
                                default:
                                    switch (i14) {
                                        case 30:
                                            i23 = 256;
                                            i17 = -1;
                                            break;
                                        case 31:
                                            i23 = 512;
                                            i17 = -1;
                                            break;
                                        case 32:
                                            i23 = 1024;
                                            i17 = -1;
                                            break;
                                        default:
                                            switch (i14) {
                                                case 40:
                                                    i23 = 2048;
                                                    i17 = -1;
                                                    break;
                                                case 41:
                                                    i23 = 4096;
                                                    i17 = -1;
                                                    break;
                                                case 42:
                                                    i23 = 8192;
                                                    i17 = -1;
                                                    break;
                                                default:
                                                    switch (i14) {
                                                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                                            i23 = 16384;
                                                            i17 = -1;
                                                            break;
                                                        case 51:
                                                            i23 = 32768;
                                                            i17 = -1;
                                                            break;
                                                        case 52:
                                                            i17 = -1;
                                                            i23 = 65536;
                                                            break;
                                                        default:
                                                            i17 = -1;
                                                            i23 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i23 == i17) {
                        return new Pair(Integer.valueOf(i15), Integer.valueOf(i23));
                    }
                    AbstractC20734X.m21224A(i14, "Unknown AVC level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    AbstractC0168G.m508C("Ignoring malformed AVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    AbstractC0168G.m508C("Ignoring malformed HEVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                Matcher matcher2 = pattern.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    AbstractC0168G.m508C("Ignoring malformed HEVC codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i18 = 1;
                } else {
                    if (!"2".equals(strGroup2)) {
                        AbstractC0168G.m508C("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        return null;
                    }
                    C19781h c19781h2 = c19788o.f62765z;
                    i18 = (c19781h2 == null || c19781h2.f62677c != 6) ? 2 : 4096;
                }
                String str6 = strArrSplit[3];
                if (str6 != null) {
                    switch (str6) {
                        case "H30":
                            num = 2;
                            break;
                        case "H60":
                            num = 8;
                            break;
                        case "H63":
                            num = 32;
                            break;
                        case "H90":
                            num = 128;
                            break;
                        case "H93":
                            num = 512;
                            break;
                        case "L30":
                            num = 1;
                            break;
                        case "L60":
                            num = 4;
                            break;
                        case "L63":
                            num = 16;
                            break;
                        case "L90":
                            num = 64;
                            break;
                        case "L93":
                            num = 256;
                            break;
                        case "H120":
                            num = 2048;
                            break;
                        case "H123":
                            num = 8192;
                            break;
                        case "H150":
                            num = 32768;
                            break;
                        case "H153":
                            num = 131072;
                            break;
                        case "H156":
                            num = 524288;
                            break;
                        case "H180":
                            num = 2097152;
                            break;
                        case "H183":
                            num = 8388608;
                            break;
                        case "H186":
                            num = 33554432;
                            break;
                        case "L120":
                            num = 1024;
                            break;
                        case "L123":
                            num = 4096;
                            break;
                        case "L150":
                            num = 16384;
                            break;
                        case "L153":
                            num = 65536;
                            break;
                        case "L156":
                            num = 262144;
                            break;
                        case "L180":
                            num = 1048576;
                            break;
                        case "L183":
                            num = 4194304;
                            break;
                        case "L186":
                            num = 16777216;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    return new Pair(Integer.valueOf(i18), num);
                }
                AbstractC0168G.m508C("Unknown HEVC level string: ", str6, "MediaCodecUtil");
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    AbstractC0168G.m508C("Ignoring malformed MP4A codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(AbstractC19754D.m20704b(Integer.parseInt(strArrSplit[1], 16)))) {
                        return null;
                    }
                    int i27 = Integer.parseInt(strArrSplit[2]);
                    int i28 = 17;
                    if (i27 == 17) {
                        i19 = -1;
                    } else {
                        if (i27 != 20) {
                            i28 = 23;
                            if (i27 != 23) {
                                i28 = 29;
                                if (i27 != 29) {
                                    i28 = 39;
                                    if (i27 != 39) {
                                        i28 = 42;
                                        if (i27 != 42) {
                                            switch (i27) {
                                                case 1:
                                                    i28 = 1;
                                                    break;
                                                case 2:
                                                    i19 = -1;
                                                    i28 = 2;
                                                    break;
                                                case 3:
                                                    i28 = 3;
                                                    break;
                                                case 4:
                                                    i28 = 4;
                                                    break;
                                                case 5:
                                                    i28 = 5;
                                                    break;
                                                case 6:
                                                    i19 = -1;
                                                    i28 = 6;
                                                    break;
                                                default:
                                                    i19 = -1;
                                                    i28 = -1;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i28 = 20;
                        }
                        i19 = -1;
                    }
                    if (i28 != i19) {
                        return new Pair(Integer.valueOf(i28), 0);
                    }
                    return null;
                } catch (NumberFormatException unused3) {
                    AbstractC0168G.m508C("Ignoring malformed MP4A codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            case "vp09":
                if (strArrSplit.length < 3) {
                    AbstractC0168G.m508C("Ignoring malformed VP9 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
                try {
                    int i29 = Integer.parseInt(strArrSplit[1]);
                    int i30 = Integer.parseInt(strArrSplit[2]);
                    if (i29 == 0) {
                        i20 = 1;
                    } else if (i29 == 1) {
                        i20 = 2;
                    } else if (i29 != 2) {
                        i20 = i29 != 3 ? -1 : 8;
                    } else {
                        i20 = 4;
                    }
                    if (i20 == -1) {
                        AbstractC20734X.m21224A(i29, "Unknown VP9 profile: ", "MediaCodecUtil");
                        return null;
                    }
                    if (i30 != 10) {
                        if (i30 == 11) {
                            i21 = -1;
                            i23 = 2;
                        } else if (i30 == 20) {
                            i23 = 4;
                        } else if (i30 == 21) {
                            i23 = 8;
                        } else if (i30 != 30) {
                            if (i30 == 31) {
                                i23 = 32;
                            } else if (i30 == 40) {
                                i23 = 64;
                            } else if (i30 == 41) {
                                i23 = 128;
                            } else if (i30 == 50) {
                                i23 = 256;
                            } else if (i30 != 51) {
                                switch (i30) {
                                    case 60:
                                        i23 = 2048;
                                        break;
                                    case 61:
                                        i23 = 4096;
                                        break;
                                    case 62:
                                        i23 = 8192;
                                        break;
                                    default:
                                        i21 = -1;
                                        i23 = -1;
                                        break;
                                }
                            } else {
                                i23 = 512;
                            }
                        }
                        if (i23 == i21) {
                            return new Pair(Integer.valueOf(i20), Integer.valueOf(i23));
                        }
                        AbstractC20734X.m21224A(i30, "Unknown VP9 level: ", "MediaCodecUtil");
                        return null;
                    }
                    i23 = 1;
                    i21 = -1;
                    if (i23 == i21) {
                        return new Pair(Integer.valueOf(i20), Integer.valueOf(i23));
                    }
                    AbstractC20734X.m21224A(i30, "Unknown VP9 level: ", "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    AbstractC0168G.m508C("Ignoring malformed VP9 codec string: ", str3, "MediaCodecUtil");
                    return null;
                }
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m4051h(MediaCodecInfo mediaCodecInfo, String str, boolean z6, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z6 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = AbstractC20817s.f66106a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC20817s.f66108c))) {
            String str3 = AbstractC20817s.f66107b;
            if (str3.startsWith("zeroflte") || str3.startsWith(HpucjswO.CHlXYiGdgz) || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        if (i10 == 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(AbstractC20817s.f66108c)) {
            String str4 = AbstractC20817s.f66107b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        if (i10 == 19 && AbstractC20817s.f66107b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }
}
