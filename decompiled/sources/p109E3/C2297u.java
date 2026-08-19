package p109E3;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1073w3.C20813o;
import p1139z0.C21585H;
import p571X9.AbstractC9306j0;
import p720e6.C13287b;
import p720e6.C13288c;

/* JADX INFO: renamed from: E3.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2297u {

    /* JADX INFO: renamed from: A */
    public long f7098A;

    /* JADX INFO: renamed from: B */
    public long f7099B;

    /* JADX INFO: renamed from: C */
    public long f7100C;

    /* JADX INFO: renamed from: D */
    public long f7101D;

    /* JADX INFO: renamed from: E */
    public boolean f7102E;

    /* JADX INFO: renamed from: F */
    public long f7103F;

    /* JADX INFO: renamed from: G */
    public long f7104G;

    /* JADX INFO: renamed from: H */
    public boolean f7105H;

    /* JADX INFO: renamed from: I */
    public long f7106I;

    /* JADX INFO: renamed from: J */
    public C20813o f7107J;

    /* JADX INFO: renamed from: a */
    public final C13287b f7108a;

    /* JADX INFO: renamed from: b */
    public final long[] f7109b;

    /* JADX INFO: renamed from: c */
    public AudioTrack f7110c;

    /* JADX INFO: renamed from: d */
    public int f7111d;

    /* JADX INFO: renamed from: e */
    public int f7112e;

    /* JADX INFO: renamed from: f */
    public C2296t f7113f;

    /* JADX INFO: renamed from: g */
    public int f7114g;

    /* JADX INFO: renamed from: h */
    public boolean f7115h;

    /* JADX INFO: renamed from: i */
    public long f7116i;

    /* JADX INFO: renamed from: j */
    public float f7117j;

    /* JADX INFO: renamed from: k */
    public boolean f7118k;

    /* JADX INFO: renamed from: l */
    public long f7119l;

    /* JADX INFO: renamed from: m */
    public long f7120m;

    /* JADX INFO: renamed from: n */
    public Method f7121n;

    /* JADX INFO: renamed from: o */
    public long f7122o;

    /* JADX INFO: renamed from: p */
    public boolean f7123p;

    /* JADX INFO: renamed from: q */
    public boolean f7124q;

    /* JADX INFO: renamed from: r */
    public long f7125r;

    /* JADX INFO: renamed from: s */
    public long f7126s;

    /* JADX INFO: renamed from: t */
    public long f7127t;

    /* JADX INFO: renamed from: u */
    public long f7128u;

    /* JADX INFO: renamed from: v */
    public long f7129v;

    /* JADX INFO: renamed from: w */
    public int f7130w;

    /* JADX INFO: renamed from: x */
    public int f7131x;

    /* JADX INFO: renamed from: y */
    public long f7132y;

    /* JADX INFO: renamed from: z */
    public long f7133z;

    public C2297u(C13287b c13287b) {
        this.f7108a = c13287b;
        try {
            this.f7121n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f7109b = new long[10];
        this.f7107J = C20813o.f66098a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0143  */
    /* JADX WARN: Code duplicated, block: B:73:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x016e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f A[Catch: Exception -> 0x0245, TRY_LEAVE, TryCatch #0 {Exception -> 0x0245, blocks: (B:93:0x0209, B:95:0x022f), top: B:141:0x0209 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x022f, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final long m3383a(boolean z6) {
        long jM21394H;
        C2296t c2296t;
        C2295s c2295s;
        boolean z10;
        Method method;
        long jMax;
        long j10;
        long j11;
        long jM21394H2;
        AudioTrack audioTrack = this.f7110c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        C2268I c2268i = (C2268I) this.f7108a.f42000Z;
        if (playState == 3) {
            this.f7107J.getClass();
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f7120m >= 30000) {
                long jM21394H3 = AbstractC20817s.m21394H(this.f7114g, m3384b());
                if (jM21394H3 != 0) {
                    int i10 = this.f7130w;
                    float f10 = this.f7117j;
                    if (f10 != 1.0f) {
                        jM21394H3 = Math.round(jM21394H3 / ((double) f10));
                    }
                    long[] jArr = this.f7109b;
                    jArr[i10] = jM21394H3 - jNanoTime;
                    this.f7130w = (this.f7130w + 1) % 10;
                    int i11 = this.f7131x;
                    if (i11 < 10) {
                        this.f7131x = i11 + 1;
                    }
                    this.f7120m = jNanoTime;
                    this.f7119l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f7131x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f7119l = (jArr[i12] / ((long) i13)) + this.f7119l;
                        i12++;
                    }
                    if (!this.f7115h) {
                        c2296t = this.f7113f;
                        c2296t.getClass();
                        c2295s = c2296t.f7092a;
                        if (c2295s != null || jNanoTime - c2296t.f7096e < c2296t.f7095d) {
                            c2296t = c2296t;
                        } else {
                            c2296t.f7096e = jNanoTime;
                            AudioTrack audioTrack2 = c2295s.f7085a;
                            AudioTimestamp audioTimestamp = c2295s.f7086b;
                            boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                            if (timestamp) {
                                long j12 = audioTimestamp.framePosition;
                                long j13 = c2295s.f7088d;
                                if (j13 > j12) {
                                    if (c2295s.f7090f) {
                                        c2295s.f7091g += j13;
                                        c2295s.f7090f = false;
                                    } else {
                                        c2295s.f7087c++;
                                    }
                                }
                                c2295s.f7088d = j12;
                                c2295s.f7089e = j12 + c2295s.f7091g + (c2295s.f7087c << 32);
                            }
                            int i14 = c2296t.f7093b;
                            if (i14 != 0) {
                                if (i14 != 1) {
                                    if (i14 != 2) {
                                        if (i14 != 3) {
                                            if (i14 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (timestamp) {
                                            c2296t.m3381a();
                                        }
                                    } else if (timestamp == 0) {
                                        c2296t.m3381a();
                                    }
                                } else if (timestamp == 0) {
                                    c2296t.m3381a();
                                } else if (c2295s.f7089e > c2296t.f7097f) {
                                    c2296t.m3382b(2);
                                }
                            } else if (timestamp != 0) {
                                if (audioTimestamp.nanoTime / 1000 >= c2296t.f7094c) {
                                    c2296t.f7097f = c2295s.f7089e;
                                    c2296t.m3382b(1);
                                }
                                if (z10) {
                                    if (c2295s != null) {
                                        j10 = c2295s.f7086b.nanoTime / 1000;
                                    } else {
                                        j10 = -9223372036854775807L;
                                    }
                                    if (c2295s != null) {
                                        j11 = c2295s.f7089e;
                                    } else {
                                        j11 = -1;
                                    }
                                    jM21394H2 = AbstractC20817s.m21394H(this.f7114g, m3384b());
                                    if (Math.abs(j10 - jNanoTime) > 5000000) {
                                        StringBuilder sbM9894m = AbstractC9306j0.m9894m("Spurious audio timestamp (system clock mismatch): ", j11, ", ");
                                        sbM9894m.append(j10);
                                        sbM9894m.append(", ");
                                        sbM9894m.append(jNanoTime);
                                        sbM9894m.append(", ");
                                        sbM9894m.append(jM21394H2);
                                        sbM9894m.append(", ");
                                        sbM9894m.append(c2268i.m3316g());
                                        sbM9894m.append(", ");
                                        sbM9894m.append(c2268i.m3317h());
                                        AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m.toString());
                                        c2296t.m3382b(4);
                                    } else if (Math.abs(AbstractC20817s.m21394H(this.f7114g, j11) - jM21394H2) > 5000000) {
                                        StringBuilder sbM9894m2 = AbstractC9306j0.m9894m("Spurious audio timestamp (frame position mismatch): ", j11, ", ");
                                        sbM9894m2.append(j10);
                                        sbM9894m2.append(", ");
                                        sbM9894m2.append(jNanoTime);
                                        sbM9894m2.append(", ");
                                        sbM9894m2.append(jM21394H2);
                                        sbM9894m2.append(", ");
                                        sbM9894m2.append(c2268i.m3316g());
                                        sbM9894m2.append(", ");
                                        sbM9894m2.append(c2268i.m3317h());
                                        AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m2.toString());
                                        c2296t.m3382b(4);
                                    } else if (c2296t.f7093b == 4) {
                                        c2296t.m3381a();
                                    }
                                }
                                if (this.f7124q && (method = this.f7121n) != null && jNanoTime - this.f7125r >= 500000) {
                                    try {
                                        AudioTrack audioTrack3 = this.f7110c;
                                        audioTrack3.getClass();
                                        Integer num = (Integer) method.invoke(audioTrack3, null);
                                        int i15 = AbstractC20817s.f66106a;
                                        long jIntValue = (((long) num.intValue()) * 1000) - this.f7116i;
                                        this.f7122o = jIntValue;
                                        jMax = Math.max(jIntValue, 0L);
                                        this.f7122o = jMax;
                                        if (jMax > 5000000) {
                                            AbstractC20800b.m21332t("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                            this.f7122o = 0L;
                                        }
                                    } catch (Exception unused) {
                                        this.f7121n = null;
                                    }
                                    this.f7125r = jNanoTime;
                                }
                            } else if (jNanoTime - c2296t.f7094c > 500000) {
                                c2296t.m3382b(3);
                            }
                            z10 = timestamp;
                            if (z10) {
                                if (c2295s != null) {
                                    j10 = c2295s.f7086b.nanoTime / 1000;
                                } else {
                                    j10 = -9223372036854775807L;
                                }
                                if (c2295s != null) {
                                    j11 = c2295s.f7089e;
                                } else {
                                    j11 = -1;
                                }
                                jM21394H2 = AbstractC20817s.m21394H(this.f7114g, m3384b());
                                if (Math.abs(j10 - jNanoTime) > 5000000) {
                                    StringBuilder sbM9894m3 = AbstractC9306j0.m9894m("Spurious audio timestamp (system clock mismatch): ", j11, ", ");
                                    sbM9894m3.append(j10);
                                    sbM9894m3.append(", ");
                                    sbM9894m3.append(jNanoTime);
                                    sbM9894m3.append(", ");
                                    sbM9894m3.append(jM21394H2);
                                    sbM9894m3.append(", ");
                                    sbM9894m3.append(c2268i.m3316g());
                                    sbM9894m3.append(", ");
                                    sbM9894m3.append(c2268i.m3317h());
                                    AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m3.toString());
                                    c2296t.m3382b(4);
                                } else if (Math.abs(AbstractC20817s.m21394H(this.f7114g, j11) - jM21394H2) > 5000000) {
                                    StringBuilder sbM9894m4 = AbstractC9306j0.m9894m("Spurious audio timestamp (frame position mismatch): ", j11, ", ");
                                    sbM9894m4.append(j10);
                                    sbM9894m4.append(", ");
                                    sbM9894m4.append(jNanoTime);
                                    sbM9894m4.append(", ");
                                    sbM9894m4.append(jM21394H2);
                                    sbM9894m4.append(", ");
                                    sbM9894m4.append(c2268i.m3316g());
                                    sbM9894m4.append(", ");
                                    sbM9894m4.append(c2268i.m3317h());
                                    AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m4.toString());
                                    c2296t.m3382b(4);
                                } else if (c2296t.f7093b == 4) {
                                    c2296t.m3381a();
                                }
                            }
                            if (this.f7124q) {
                                AudioTrack audioTrack4 = this.f7110c;
                                audioTrack4.getClass();
                                Integer num2 = (Integer) method.invoke(audioTrack4, null);
                                int i16 = AbstractC20817s.f66106a;
                                long jIntValue2 = (((long) num2.intValue()) * 1000) - this.f7116i;
                                this.f7122o = jIntValue2;
                                jMax = Math.max(jIntValue2, 0L);
                                this.f7122o = jMax;
                                if (jMax > 5000000) {
                                    AbstractC20800b.m21332t("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                    this.f7122o = 0L;
                                }
                                this.f7125r = jNanoTime;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            if (c2295s != null) {
                                j10 = c2295s.f7086b.nanoTime / 1000;
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (c2295s != null) {
                                j11 = c2295s.f7089e;
                            } else {
                                j11 = -1;
                            }
                            jM21394H2 = AbstractC20817s.m21394H(this.f7114g, m3384b());
                            if (Math.abs(j10 - jNanoTime) > 5000000) {
                                StringBuilder sbM9894m5 = AbstractC9306j0.m9894m("Spurious audio timestamp (system clock mismatch): ", j11, ", ");
                                sbM9894m5.append(j10);
                                sbM9894m5.append(", ");
                                sbM9894m5.append(jNanoTime);
                                sbM9894m5.append(", ");
                                sbM9894m5.append(jM21394H2);
                                sbM9894m5.append(", ");
                                sbM9894m5.append(c2268i.m3316g());
                                sbM9894m5.append(", ");
                                sbM9894m5.append(c2268i.m3317h());
                                AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m5.toString());
                                c2296t.m3382b(4);
                            } else if (Math.abs(AbstractC20817s.m21394H(this.f7114g, j11) - jM21394H2) > 5000000) {
                                StringBuilder sbM9894m6 = AbstractC9306j0.m9894m("Spurious audio timestamp (frame position mismatch): ", j11, ", ");
                                sbM9894m6.append(j10);
                                sbM9894m6.append(", ");
                                sbM9894m6.append(jNanoTime);
                                sbM9894m6.append(", ");
                                sbM9894m6.append(jM21394H2);
                                sbM9894m6.append(", ");
                                sbM9894m6.append(c2268i.m3316g());
                                sbM9894m6.append(", ");
                                sbM9894m6.append(c2268i.m3317h());
                                AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m6.toString());
                                c2296t.m3382b(4);
                            } else if (c2296t.f7093b == 4) {
                                c2296t.m3381a();
                            }
                        }
                        if (this.f7124q) {
                            AudioTrack audioTrack5 = this.f7110c;
                            audioTrack5.getClass();
                            Integer num3 = (Integer) method.invoke(audioTrack5, null);
                            int i17 = AbstractC20817s.f66106a;
                            long jIntValue3 = (((long) num3.intValue()) * 1000) - this.f7116i;
                            this.f7122o = jIntValue3;
                            jMax = Math.max(jIntValue3, 0L);
                            this.f7122o = jMax;
                            if (jMax > 5000000) {
                                AbstractC20800b.m21332t("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                this.f7122o = 0L;
                            }
                            this.f7125r = jNanoTime;
                        }
                    }
                }
            } else if (!this.f7115h) {
                c2296t = this.f7113f;
                c2296t.getClass();
                c2295s = c2296t.f7092a;
                if (c2295s != null) {
                    c2296t = c2296t;
                    z10 = false;
                } else {
                    c2296t = c2296t;
                    z10 = false;
                }
                if (z10) {
                    if (c2295s != null) {
                        j10 = c2295s.f7086b.nanoTime / 1000;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    if (c2295s != null) {
                        j11 = c2295s.f7089e;
                    } else {
                        j11 = -1;
                    }
                    jM21394H2 = AbstractC20817s.m21394H(this.f7114g, m3384b());
                    if (Math.abs(j10 - jNanoTime) > 5000000) {
                        StringBuilder sbM9894m7 = AbstractC9306j0.m9894m("Spurious audio timestamp (system clock mismatch): ", j11, ", ");
                        sbM9894m7.append(j10);
                        sbM9894m7.append(", ");
                        sbM9894m7.append(jNanoTime);
                        sbM9894m7.append(", ");
                        sbM9894m7.append(jM21394H2);
                        sbM9894m7.append(", ");
                        sbM9894m7.append(c2268i.m3316g());
                        sbM9894m7.append(", ");
                        sbM9894m7.append(c2268i.m3317h());
                        AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m7.toString());
                        c2296t.m3382b(4);
                    } else if (Math.abs(AbstractC20817s.m21394H(this.f7114g, j11) - jM21394H2) > 5000000) {
                        StringBuilder sbM9894m8 = AbstractC9306j0.m9894m("Spurious audio timestamp (frame position mismatch): ", j11, ", ");
                        sbM9894m8.append(j10);
                        sbM9894m8.append(", ");
                        sbM9894m8.append(jNanoTime);
                        sbM9894m8.append(", ");
                        sbM9894m8.append(jM21394H2);
                        sbM9894m8.append(", ");
                        sbM9894m8.append(c2268i.m3316g());
                        sbM9894m8.append(", ");
                        sbM9894m8.append(c2268i.m3317h());
                        AbstractC20800b.m21332t("DefaultAudioSink", sbM9894m8.toString());
                        c2296t.m3382b(4);
                    } else if (c2296t.f7093b == 4) {
                        c2296t.m3381a();
                    }
                }
                if (this.f7124q) {
                    AudioTrack audioTrack6 = this.f7110c;
                    audioTrack6.getClass();
                    Integer num4 = (Integer) method.invoke(audioTrack6, null);
                    int i18 = AbstractC20817s.f66106a;
                    long jIntValue4 = (((long) num4.intValue()) * 1000) - this.f7116i;
                    this.f7122o = jIntValue4;
                    jMax = Math.max(jIntValue4, 0L);
                    this.f7122o = jMax;
                    if (jMax > 5000000) {
                        AbstractC20800b.m21332t("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                        this.f7122o = 0L;
                    }
                    this.f7125r = jNanoTime;
                }
            }
        }
        this.f7107J.getClass();
        long jNanoTime2 = System.nanoTime() / 1000;
        C2296t c2296t2 = this.f7113f;
        c2296t2.getClass();
        boolean z11 = c2296t2.f7093b == 2;
        if (z11) {
            C2295s c2295s2 = c2296t2.f7092a;
            jM21394H = AbstractC20817s.m21418s(this.f7117j, jNanoTime2 - (c2295s2 != null ? c2295s2.f7086b.nanoTime / 1000 : -9223372036854775807L)) + AbstractC20817s.m21394H(this.f7114g, c2295s2 != null ? c2295s2.f7089e : -1L);
        } else {
            jM21394H = this.f7131x == 0 ? AbstractC20817s.m21394H(this.f7114g, m3384b()) : AbstractC20817s.m21418s(this.f7117j, this.f7119l + jNanoTime2);
            if (!z6) {
                jM21394H = Math.max(0L, jM21394H - this.f7122o);
            }
        }
        if (this.f7102E != z11) {
            this.f7104G = this.f7101D;
            this.f7103F = this.f7100C;
        }
        long j14 = jNanoTime2 - this.f7104G;
        if (j14 < 1000000) {
            long jM21418s = AbstractC20817s.m21418s(this.f7117j, j14) + this.f7103F;
            long j15 = (j14 * 1000) / 1000000;
            jM21394H = (((1000 - j15) * jM21418s) + (jM21394H * j15)) / 1000;
        }
        if (!this.f7118k) {
            long j16 = this.f7100C;
            if (jM21394H > j16) {
                this.f7118k = true;
                long jM21399M = AbstractC20817s.m21399M(jM21394H - j16);
                float f11 = this.f7117j;
                if (f11 != 1.0f) {
                    jM21399M = Math.round(jM21399M / ((double) f11));
                }
                this.f7107J.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - AbstractC20817s.m21399M(jM21399M);
                C13288c c13288c = c2268i.f6997s;
                if (c13288c != null) {
                    C21585H c21585h = ((C2271L) c13288c.f42001Y).f7007R1;
                    Handler handler = (Handler) c21585h.f68344Z;
                    if (handler != null) {
                        handler.post(new RunnableC2289m(c21585h, jCurrentTimeMillis));
                    }
                }
            }
        }
        this.f7101D = jNanoTime2;
        this.f7100C = jM21394H;
        this.f7102E = z11;
        return jM21394H;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX INFO: renamed from: b */
    public final long m3384b() {
        long j10;
        this.f7107J.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f7132y != -9223372036854775807L) {
            AudioTrack audioTrack = this.f7110c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.f7098A;
            }
            return Math.min(this.f7099B, this.f7098A + AbstractC20817s.m21396J(AbstractC20817s.m21418s(this.f7117j, AbstractC20817s.m21390D(jElapsedRealtime) - this.f7132y), this.f7114g, 1000000L, RoundingMode.CEILING));
        }
        if (jElapsedRealtime - this.f7126s >= 5) {
            AudioTrack audioTrack2 = this.f7110c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f7115h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f7129v = this.f7127t;
                    }
                    playbackHeadPosition += this.f7129v;
                }
                if (AbstractC20817s.f66106a > 29) {
                    j10 = this.f7127t;
                    if (j10 > playbackHeadPosition) {
                        if (this.f7105H) {
                            this.f7106I += j10;
                            this.f7105H = false;
                        } else {
                            this.f7128u++;
                        }
                    }
                    this.f7127t = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.f7127t <= 0 || playState != 3) {
                    this.f7133z = -9223372036854775807L;
                    j10 = this.f7127t;
                    if (j10 > playbackHeadPosition) {
                        if (this.f7105H) {
                            this.f7106I += j10;
                            this.f7105H = false;
                        } else {
                            this.f7128u++;
                        }
                    }
                    this.f7127t = playbackHeadPosition;
                } else if (this.f7133z == -9223372036854775807L) {
                    this.f7133z = jElapsedRealtime;
                }
            }
            this.f7126s = jElapsedRealtime;
        }
        return this.f7127t + this.f7106I + (this.f7128u << 32);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3385c(long j10) {
        long jM3383a = m3383a(false);
        int i10 = this.f7114g;
        int i11 = AbstractC20817s.f66106a;
        if (j10 <= AbstractC20817s.m21396J(jM3383a, i10, 1000000L, RoundingMode.CEILING)) {
            if (!this.f7115h) {
                return false;
            }
            AudioTrack audioTrack = this.f7110c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || m3384b() != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m3386d() {
        this.f7119l = 0L;
        this.f7131x = 0;
        this.f7130w = 0;
        this.f7120m = 0L;
        this.f7101D = 0L;
        this.f7104G = 0L;
        this.f7118k = false;
    }
}
