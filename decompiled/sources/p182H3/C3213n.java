package p182H3;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p001A.AbstractC0010F;
import p057C3.C1558f;
import p1016t3.AbstractC19754D;
import p1016t3.C19781h;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC8096g6;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: H3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3213n {

    /* JADX INFO: renamed from: a */
    public final String f9703a;

    /* JADX INFO: renamed from: b */
    public final String f9704b;

    /* JADX INFO: renamed from: c */
    public final String f9705c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f9706d;

    /* JADX INFO: renamed from: e */
    public final boolean f9707e;

    /* JADX INFO: renamed from: f */
    public final boolean f9708f;

    /* JADX INFO: renamed from: g */
    public final boolean f9709g;

    /* JADX INFO: renamed from: h */
    public final boolean f9710h;

    public C3213n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z10, boolean z11) {
        str.getClass();
        this.f9703a = str;
        this.f9704b = str2;
        this.f9705c = str3;
        this.f9706d = codecCapabilities;
        this.f9709g = z6;
        this.f9707e = z10;
        this.f9708f = z11;
        this.f9710h = AbstractC19754D.m20710h(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4075a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC20817s.m21405f(i10, widthAlignment) * widthAlignment, AbstractC20817s.m21405f(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX INFO: renamed from: h */
    public static C3213n m4076h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z6, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (codecCapabilities == null || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z13 = false;
        } else {
            if (AbstractC20817s.f66106a <= 22) {
                String str4 = AbstractC20817s.f66109d;
                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                    z13 = false;
                }
            }
            z13 = true;
        }
        if (codecCapabilities != null && AbstractC20817s.f66106a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new C3213n(str, str2, str3, codecCapabilities, z6, z13, z12 || (codecCapabilities != null && AbstractC20817s.f66106a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    /* JADX INFO: renamed from: b */
    public final C1558f m4077b(C19788o c19788o, C19788o c19788o2) {
        int i10 = !AbstractC20817s.m21400a(c19788o.f62752m, c19788o2.f62752m) ? 8 : 0;
        if (this.f9710h) {
            if (c19788o.f62761v != c19788o2.f62761v) {
                i10 |= 1024;
            }
            if (!this.f9707e && (c19788o.f62758s != c19788o2.f62758s || c19788o.f62759t != c19788o2.f62759t)) {
                i10 |= 512;
            }
            C19781h c19781h = c19788o.f62765z;
            boolean zM20740e = C19781h.m20740e(c19781h);
            C19781h c19781h2 = c19788o2.f62765z;
            if ((!zM20740e || !C19781h.m20740e(c19781h2)) && !AbstractC20817s.m21400a(c19781h, c19781h2)) {
                i10 |= 2048;
            }
            if (AbstractC20817s.f66109d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f9703a) && !c19788o.m20749c(c19788o2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1558f(this.f9703a, c19788o, c19788o2, c19788o.m20749c(c19788o2) ? 3 : 2, 0);
            }
        } else {
            if (c19788o.f62729A != c19788o2.f62729A) {
                i10 |= 4096;
            }
            if (c19788o.f62730B != c19788o2.f62730B) {
                i10 |= 8192;
            }
            if (c19788o.f62731C != c19788o2.f62731C) {
                i10 |= 16384;
            }
            String str = this.f9704b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairM4047d = AbstractC3199A.m4047d(c19788o);
                Pair pairM4047d2 = AbstractC3199A.m4047d(c19788o2);
                if (pairM4047d != null && pairM4047d2 != null) {
                    int iIntValue = ((Integer) pairM4047d.first).intValue();
                    int iIntValue2 = ((Integer) pairM4047d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1558f(this.f9703a, c19788o, c19788o2, 3, 0);
                    }
                }
            }
            if (!c19788o.m20749c(c19788o2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C1558f(this.f9703a, c19788o, c19788o2, 1, 0);
            }
        }
        return new C1558f(this.f9703a, c19788o, c19788o2, 0, i10);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4078c(C19788o c19788o, boolean z6) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM4047d = AbstractC3199A.m4047d(c19788o);
        if (pairM4047d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM4047d.first).intValue();
        int iIntValue2 = ((Integer) pairM4047d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c19788o.f62752m);
        int i10 = 8;
        String str = this.f9704b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue2 = 0;
                iIntValue = 2;
            }
        }
        if (!this.f9710h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9706d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC20817s.f66106a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i10 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i10 = 512;
            } else if (iIntValue3 >= 60000000) {
                i10 = 256;
            } else if (iIntValue3 >= 30000000) {
                i10 = 128;
            } else if (iIntValue3 >= 18000000) {
                i10 = 64;
            } else if (iIntValue3 >= 12000000) {
                i10 = 32;
            } else if (iIntValue3 >= 7200000) {
                i10 = 16;
            } else if (iIntValue3 < 3600000) {
                i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i10;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z6)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = AbstractC20817s.f66107b;
                    if (efyhmdM.rQDreHiakYSi.equals(str2) || "marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        m4082g("codec.profileLevel, " + c19788o.f62749j + ", " + this.f9705c);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0164, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final boolean m4079d(C19788o c19788o) {
        int i10;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        int i11;
        int i12;
        String str = c19788o.f62752m;
        String str2 = this.f9704b;
        boolean z6 = true;
        if (!(str2.equals(str) || str2.equals(AbstractC3199A.m4045b(c19788o))) || !m4078c(c19788o, true)) {
            return false;
        }
        if (this.f9710h) {
            int i13 = c19788o.f62758s;
            if (i13 > 0 && (i12 = c19788o.f62759t) > 0) {
                if (AbstractC20817s.f66106a >= 21) {
                    return m4081f(i13, i12, c19788o.f62760u);
                }
                z6 = i13 * i12 <= AbstractC3199A.m4053j();
                if (!z6) {
                    m4082g("legacyFrameSize, " + i13 + "x" + i12);
                }
            }
            return z6;
        }
        int i14 = AbstractC20817s.f66106a;
        if (i14 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9706d;
        int i15 = c19788o.f62730B;
        if (i15 == -1) {
            i10 = c19788o.f62729A;
            if (i10 != -1) {
                return true;
            }
            if (codecCapabilities == null) {
                m4082g("channelCount.caps");
            } else {
                audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m4082g("channelCount.aCaps");
                } else {
                    maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i11 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i11 = 16;
                        } else {
                            i11 = 30;
                        }
                        AbstractC20800b.m21332t("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f9703a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                        maxInputChannelCount = i11;
                    }
                    if (maxInputChannelCount < i10) {
                        return true;
                    }
                    m4082g("channelCount.support, " + i10);
                }
            }
        } else if (codecCapabilities == null) {
            m4082g("sampleRate.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                m4082g("sampleRate.aCaps");
            } else if (audioCapabilities2.isSampleRateSupported(i15)) {
                i10 = c19788o.f62729A;
                if (i10 != -1) {
                    return true;
                }
                if (codecCapabilities == null) {
                    m4082g("channelCount.caps");
                } else {
                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m4082g("channelCount.aCaps");
                    } else {
                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1) {
                            if ("audio/ac3".equals(str2)) {
                                i11 = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i11 = 16;
                            } else {
                                i11 = 30;
                            }
                            AbstractC20800b.m21332t("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f9703a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i10) {
                            return true;
                        }
                        m4082g("channelCount.support, " + i10);
                    }
                }
            } else {
                m4082g("sampleRate.support, " + i15);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4080e(C19788o c19788o) {
        if (this.f9710h) {
            return this.f9707e;
        }
        Pair pairM4047d = AbstractC3199A.m4047d(c19788o);
        return pairM4047d != null && ((Integer) pairM4047d.first).intValue() == 42;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4081f(int i10, int i11, double d10) {
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9706d;
        if (codecCapabilities == null) {
            m4082g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m4082g("sizeAndRate.vCaps");
            return false;
        }
        int i12 = AbstractC20817s.f66106a;
        if (i12 >= 29) {
            int iM4083a = (i12 < 29 || ((bool = AbstractC8096g6.f25433a) != null && bool.booleanValue())) ? 0 : AbstractC3214o.m4083a(videoCapabilities, i10, i11, d10);
            if (iM4083a == 2) {
                return true;
            }
            if (iM4083a == 1) {
                StringBuilder sbM21e = AbstractC0010F.m21e("sizeAndRate.cover, ", i10, "x", i11, Separators.f31989AT);
                sbM21e.append(d10);
                m4082g(sbM21e.toString());
                return false;
            }
        }
        if (!m4075a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f9703a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(AbstractC20817s.f66107b)) && m4075a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbM21e2 = AbstractC0010F.m21e("sizeAndRate.rotated, ", i10, "x", i11, Separators.f31989AT);
                    sbM21e2.append(d10);
                    StringBuilder sbM9896o = AbstractC9306j0.m9896o("AssumedSupport [", sbM21e2.toString(), "] [", str, ", ");
                    sbM9896o.append(this.f9704b);
                    sbM9896o.append("] [");
                    sbM9896o.append(AbstractC20817s.f66110e);
                    sbM9896o.append("]");
                    AbstractC20800b.m21323k("MediaCodecInfo", sbM9896o.toString());
                }
            }
            StringBuilder sbM21e3 = AbstractC0010F.m21e("sizeAndRate.support, ", i10, "x", i11, Separators.f31989AT);
            sbM21e3.append(d10);
            m4082g(sbM21e3.toString());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m4082g(String str) {
        StringBuilder sbM11058p = AbstractC10763a.m11058p("NoSupport [", str, "] [");
        sbM11058p.append(this.f9703a);
        sbM11058p.append(", ");
        sbM11058p.append(this.f9704b);
        sbM11058p.append("] [");
        sbM11058p.append(AbstractC20817s.f66110e);
        sbM11058p.append("]");
        AbstractC20800b.m21323k("MediaCodecInfo", sbM11058p.toString());
    }

    public final String toString() {
        return this.f9703a;
    }
}
