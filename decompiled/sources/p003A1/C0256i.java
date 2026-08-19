package p003A1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19506i;
import p204I1.C3573D;
import p204I1.C3588d;
import p204I1.C3590f;
import p328N1.C5605u;
import p328N1.C5606v;
import p328N1.C5609y;
import p467T1.C7191a;
import p467T1.C7200j;
import p467T1.C7205o;
import p492U1.C7548m;
import p492U1.C7549n;
import p523V9.AbstractC8088f6;
import p571X9.AbstractC9119D4;
import p759g1.C13800b;
import p774h1.C14338P;
import p774h1.C14365u;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: A1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0256i implements InterfaceC0172H0 {

    /* JADX INFO: renamed from: a */
    public final ClipboardManager f960a;

    public C0256i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f960a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX INFO: renamed from: a */
    public final C3590f m825a() {
        int i10;
        int i11 = 0;
        byte b = 2;
        byte b10 = 1;
        ClipData primaryClip = this.f960a.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        CharSequence text = itemAt != null ? itemAt.getText() : null;
        if (text == null) {
            return null;
        }
        if (!(text instanceof Spanned)) {
            return new C3590f(6, text.toString(), null);
        }
        Spanned spanned = (Spanned) text;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        AbstractC16544l.m18094g(annotationArr, "<this>");
        int length = annotationArr.length - 1;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                Annotation annotation = annotationArr[i12];
                if (AbstractC16544l.m18089b(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    Parcel parcelObtain = Parcel.obtain();
                    byte[] bArrDecode = Base64.decode(value, i11);
                    parcelObtain.unmarshall(bArrDecode, i11, bArrDecode.length);
                    parcelObtain.setDataPosition(i11);
                    long j10 = C14365u.f45060j;
                    long j11 = j10;
                    long jM9652e = C7548m.f23909c;
                    long jM9652e2 = jM9652e;
                    C5609y c5609y = null;
                    C5605u c5605u = null;
                    C5606v c5606v = null;
                    String string = null;
                    C7191a c7191a = null;
                    C7205o c7205o = null;
                    C7200j c7200j = null;
                    C14338P c14338p = null;
                    while (true) {
                        if (parcelObtain.dataAvail() > b10) {
                            byte b11 = parcelObtain.readByte();
                            if (b11 != b10) {
                                spanStart = spanStart;
                                if (b11 != b) {
                                    int i13 = 3;
                                    if (b11 != 3) {
                                        if (b11 == 4) {
                                            b10 = 1;
                                            if (parcelObtain.dataAvail() >= 1) {
                                                byte b12 = parcelObtain.readByte();
                                                c5605u = new C5605u((b12 != 0 && b12 == 1) ? 1 : 0);
                                                spanStart = spanStart;
                                                i11 = 0;
                                                b = 2;
                                            }
                                        } else if (b11 != 5) {
                                            if (b11 == 6) {
                                                string = parcelObtain.readString();
                                            } else if (b11 == 7) {
                                                if (parcelObtain.dataAvail() >= 5) {
                                                    byte b13 = parcelObtain.readByte();
                                                    long j12 = b13 == 1 ? 4294967296L : b13 == 2 ? 8589934592L : 0L;
                                                    jM9652e2 = C7549n.m7898a(j12, 0L) ? C7548m.f23909c : AbstractC9119D4.m9652e(parcelObtain.readFloat(), j12);
                                                }
                                            } else if (b11 == 8) {
                                                if (parcelObtain.dataAvail() >= 4) {
                                                    c7191a = new C7191a(parcelObtain.readFloat());
                                                }
                                            } else if (b11 == 9) {
                                                if (parcelObtain.dataAvail() >= 8) {
                                                    c7205o = new C7205o(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                }
                                            } else if (b11 != 10) {
                                                if (b11 != 11) {
                                                    i10 = 0;
                                                    if (b11 == 12) {
                                                        if (parcelObtain.dataAvail() < 20) {
                                                            break;
                                                        }
                                                        long j13 = parcelObtain.readLong();
                                                        int i14 = C14365u.f45061k;
                                                        c14338p = new C14338P(parcelObtain.readFloat(), j13, AbstractC8088f6.m8536b(parcelObtain.readFloat(), parcelObtain.readFloat()));
                                                    }
                                                } else if (parcelObtain.dataAvail() >= 4) {
                                                    int i15 = parcelObtain.readInt();
                                                    boolean z6 = (i15 & 2) != 0;
                                                    boolean z10 = (i15 & 1) != 0;
                                                    C7200j c7200j2 = C7200j.f22865d;
                                                    C7200j c7200j3 = C7200j.f22864c;
                                                    if (z6 && z10) {
                                                        i10 = 0;
                                                        List listM19382k = AbstractC17681o.m19382k(c7200j2, c7200j3);
                                                        Integer numValueOf = 0;
                                                        int size = listM19382k.size();
                                                        for (int i16 = 0; i16 < size; i16++) {
                                                            numValueOf = Integer.valueOf(numValueOf.intValue() | ((C7200j) listM19382k.get(i16)).f22866a);
                                                        }
                                                        c7200j2 = new C7200j(numValueOf.intValue());
                                                    } else {
                                                        i10 = 0;
                                                        if (!z6) {
                                                            c7200j = z10 ? c7200j3 : C7200j.f22863b;
                                                        }
                                                    }
                                                    c7200j = c7200j2;
                                                }
                                                i11 = i10;
                                                b = 2;
                                                b10 = 1;
                                            } else if (parcelObtain.dataAvail() >= 8) {
                                                j11 = parcelObtain.readLong();
                                                int i17 = C14365u.f45061k;
                                            }
                                            i11 = 0;
                                            b = 2;
                                            b10 = 1;
                                        } else if (parcelObtain.dataAvail() >= 1) {
                                            byte b14 = parcelObtain.readByte();
                                            if (b14 == 0) {
                                                i13 = 0;
                                            } else if (b14 == 1) {
                                                i13 = 1;
                                            } else if (b14 != 3) {
                                                if (b14 == 2) {
                                                    i13 = 2;
                                                } else {
                                                    i13 = 0;
                                                }
                                            }
                                            c5606v = new C5606v(i13);
                                            i11 = 0;
                                            b = 2;
                                            b10 = 1;
                                        }
                                        i10 = 0;
                                        break;
                                    }
                                    if (parcelObtain.dataAvail() < 4) {
                                        i10 = 0;
                                        break;
                                    }
                                    c5609y = new C5609y(parcelObtain.readInt());
                                    i11 = 0;
                                    b = 2;
                                    b10 = 1;
                                } else {
                                    if (parcelObtain.dataAvail() < 5) {
                                        i10 = 0;
                                        break;
                                    }
                                    byte b15 = parcelObtain.readByte();
                                    long j14 = b15 == b10 ? 4294967296L : b15 == b ? 8589934592L : 0L;
                                    jM9652e = C7549n.m7898a(j14, 0L) ? C7548m.f23909c : AbstractC9119D4.m9652e(parcelObtain.readFloat(), j14);
                                    i11 = 0;
                                    b = 2;
                                    b10 = 1;
                                }
                            } else if (parcelObtain.dataAvail() >= 8) {
                                j10 = parcelObtain.readLong();
                                int i18 = C14365u.f45061k;
                            }
                        }
                        spanStart = spanStart;
                        i10 = i11;
                        break;
                    }
                    arrayList.add(new C3588d(new C3573D(j10, jM9652e, c5609y, c5605u, c5606v, null, string, jM9652e2, c7191a, c7205o, null, j11, c7200j, c14338p, 49152), spanStart, spanEnd));
                } else {
                    i10 = i11;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                b10 = 1;
                i11 = i10;
                b = 2;
            }
        }
        return new C3590f(4, text.toString(), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m826b() {
        ClipDescription primaryClipDescription = this.f960a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX INFO: renamed from: c */
    public final void m827c(C3590f c3590f) {
        boolean zIsEmpty = c3590f.m4299b().isEmpty();
        CharSequence charSequence = c3590f.f10934Y;
        if (!zIsEmpty) {
            SpannableString spannableString = new SpannableString(charSequence);
            C19506i c19506i = new C19506i((char) 0, 1);
            c19506i.f61960Z = Parcel.obtain();
            List listM4299b = c3590f.m4299b();
            int size = listM4299b.size();
            for (int i10 = 0; i10 < size; i10++) {
                C3588d c3588d = (C3588d) listM4299b.get(i10);
                C3573D c3573d = (C3573D) c3588d.f10930a;
                ((Parcel) c19506i.f61960Z).recycle();
                c19506i.f61960Z = Parcel.obtain();
                long jMo7588b = c3573d.f10859a.mo7588b();
                long j10 = C14365u.f45060j;
                if (!C14365u.m15775c(jMo7588b, j10)) {
                    c19506i.m20608R((byte) 1);
                    ((Parcel) c19506i.f61960Z).writeLong(c3573d.f10859a.mo7588b());
                }
                long j11 = C7548m.f23909c;
                long j12 = c3573d.f10860b;
                byte b = 2;
                if (!C7548m.m7893a(j12, j11)) {
                    c19506i.m20608R((byte) 2);
                    c19506i.m20610U(j12);
                }
                C5609y c5609y = c3573d.f10861c;
                if (c5609y != null) {
                    c19506i.m20608R((byte) 3);
                    ((Parcel) c19506i.f61960Z).writeInt(c5609y.f18160Y);
                }
                C5605u c5605u = c3573d.f10862d;
                if (c5605u != null) {
                    c19506i.m20608R((byte) 4);
                    int i11 = c5605u.f18148a;
                    c19506i.m20608R((!C5605u.m5992a(i11, 0) && C5605u.m5992a(i11, 1)) ? (byte) 1 : (byte) 0);
                }
                C5606v c5606v = c3573d.f10863e;
                if (c5606v != null) {
                    c19506i.m20608R((byte) 5);
                    int i12 = c5606v.f18149a;
                    if (C5606v.m5994a(i12, 0)) {
                        b = 0;
                    } else if (C5606v.m5994a(i12, 1)) {
                        b = 1;
                    } else if (!C5606v.m5994a(i12, 2)) {
                        if (C5606v.m5994a(i12, 3)) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    c19506i.m20608R(b);
                }
                String str = c3573d.f10865g;
                if (str != null) {
                    c19506i.m20608R((byte) 6);
                    ((Parcel) c19506i.f61960Z).writeString(str);
                }
                long j13 = c3573d.f10866h;
                if (!C7548m.m7893a(j13, j11)) {
                    c19506i.m20608R((byte) 7);
                    c19506i.m20610U(j13);
                }
                C7191a c7191a = c3573d.f10867i;
                if (c7191a != null) {
                    c19506i.m20608R((byte) 8);
                    c19506i.m20609T(c7191a.f22846a);
                }
                C7205o c7205o = c3573d.f10868j;
                if (c7205o != null) {
                    c19506i.m20608R((byte) 9);
                    c19506i.m20609T(c7205o.f22872a);
                    c19506i.m20609T(c7205o.f22873b);
                }
                long j14 = c3573d.f10870l;
                if (!C14365u.m15775c(j14, j10)) {
                    c19506i.m20608R((byte) 10);
                    ((Parcel) c19506i.f61960Z).writeLong(j14);
                }
                C7200j c7200j = c3573d.f10871m;
                if (c7200j != null) {
                    c19506i.m20608R((byte) 11);
                    ((Parcel) c19506i.f61960Z).writeInt(c7200j.f22866a);
                }
                C14338P c14338p = c3573d.f10872n;
                if (c14338p != null) {
                    c19506i.m20608R((byte) 12);
                    ((Parcel) c19506i.f61960Z).writeLong(c14338p.f45001a);
                    long j15 = c14338p.f45002b;
                    c19506i.m20609T(C13800b.m15306g(j15));
                    c19506i.m20609T(C13800b.m15307h(j15));
                    c19506i.m20609T(c14338p.f45003c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c19506i.f61960Z).marshall(), 0)), c3588d.f10931b, c3588d.f10932c, 33);
            }
            charSequence = spannableString;
        }
        this.f960a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
