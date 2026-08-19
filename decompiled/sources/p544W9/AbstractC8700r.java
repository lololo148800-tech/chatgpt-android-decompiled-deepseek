package p544W9;

import android.content.res.Resources;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.C11107p;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0569E;
import p025An.C0624m;
import p025An.C0644w;
import p1113xn.C21307a;
import p153Fn.C2925c;
import p239Ja.C4322y;
import p437Rn.C6959q;
import p488Tn.AbstractC7527j;
import p488Tn.C7518a;
import p488Tn.C7524g;
import p488Tn.InterfaceC7526i;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC8112i6;
import p523V9.AbstractC8120j6;
import p523V9.AbstractC8154o0;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9381v3;
import p658b5.C11232c;
import p749fd.C13628m;
import p758g0.C13775m0;
import p769gj.C14178t;
import p769gj.C14179u;
import p769gj.C14180v;
import p769gj.ViewOnAttachStateChangeListenerC14162d;
import p972qm.C18777j;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: W9.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8700r {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final void m9405a(TextView textView, C13628m c13628m, AbstractC19687c abstractC19687c) {
        C14179u c14179u;
        if (abstractC19687c instanceof C14179u) {
            c14179u = (C14179u) abstractC19687c;
            int i10 = c14179u.f44571o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14179u.f44571o0 = i10 - Integer.MIN_VALUE;
            } else {
                c14179u = new C14179u(abstractC19687c);
            }
        } else {
            c14179u = new C14179u(abstractC19687c);
        }
        Object obj = c14179u.f44570Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14179u.f44571o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c14179u.f44569Y = c13628m;
            c14179u.f44571o0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c14179u));
            c0624m.m1262r();
            C4322y c4322y = new C4322y(c13628m, 1);
            textView.addTextChangedListener(c4322y);
            c0624m.m1264u(new C13775m0(textView, 4, c4322y));
            if (c0624m.m1261q() == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public static final void m9406b(C11232c c11232c, EditText editText) {
        AbstractC16544l.m18094g(c11232c, "<this>");
        Object tag = editText.getTag(R.id.text_controller_rendering);
        ViewOnAttachStateChangeListenerC14162d viewOnAttachStateChangeListenerC14162d = null;
        C14180v c14180v = tag instanceof C14180v ? (C14180v) tag : null;
        if ((c14180v == null ? null : c14180v.f44572a) == c11232c && c14180v.f44573b.mo1274a()) {
            return;
        }
        if (c14180v != null) {
            c14180v.f44573b.mo1275e(null);
        }
        editText.setText(c11232c.m12488l());
        C14178t c14178t = new C14178t(c11232c, editText, null);
        C18777j c18777j = C18777j.f59682Y;
        Object tag2 = editText.getTag(R.id.view_attached_coroutine_scope);
        ViewOnAttachStateChangeListenerC14162d viewOnAttachStateChangeListenerC14162d2 = tag2 instanceof ViewOnAttachStateChangeListenerC14162d ? (ViewOnAttachStateChangeListenerC14162d) tag2 : null;
        if (viewOnAttachStateChangeListenerC14162d2 != null && AbstractC0575H.m1196y(viewOnAttachStateChangeListenerC14162d2.f44535Z)) {
            viewOnAttachStateChangeListenerC14162d = viewOnAttachStateChangeListenerC14162d2;
        }
        if (viewOnAttachStateChangeListenerC14162d == null) {
            InterfaceC11112u interfaceC11112uM9219b = AbstractC8559T2.m9219b(editText);
            if (interfaceC11112uM9219b == null) {
                throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
            }
            C11107p c11107pM8861b = AbstractC8226x0.m8861b(interfaceC11112uM9219b);
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) editText.getClass().getName());
            sb3.append('@');
            sb3.append(editText.hashCode());
            sb2.append(sb3.toString());
            if (editText.getId() != -1) {
                try {
                    String resourceEntryName = editText.getResources().getResourceEntryName(editText.getId());
                    sb2.append('-');
                    sb2.append(resourceEntryName);
                } catch (Resources.NotFoundException unused) {
                }
            }
            String string = sb2.toString();
            AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
            ViewOnAttachStateChangeListenerC14162d viewOnAttachStateChangeListenerC14162d3 = new ViewOnAttachStateChangeListenerC14162d(AbstractC0575H.m1158F(c11107pM8861b, new C0569E(string)));
            editText.setTag(R.id.view_attached_coroutine_scope, viewOnAttachStateChangeListenerC14162d3);
            editText.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC14162d3);
            viewOnAttachStateChangeListenerC14162d = viewOnAttachStateChangeListenerC14162d3;
        }
        C6959q c6959q = new C6959q(viewOnAttachStateChangeListenerC14162d, c18777j, c14178t, 22);
        boolean zIsAttachedToWindow = editText.isAttachedToWindow();
        C2925c c2925c = viewOnAttachStateChangeListenerC14162d.f44535Z;
        if (zIsAttachedToWindow) {
            c6959q.invoke();
        } else {
            if (!AbstractC0575H.m1196y(c2925c)) {
                throw new IllegalStateException("Expected AttachedScope to be active when adding attach handler.");
            }
            viewOnAttachStateChangeListenerC14162d.f44534Y.add(c6959q);
        }
        editText.setTag(R.id.text_controller_rendering, new C14180v(c11232c, AbstractC0575H.m1192u(c2925c.f8769Y)));
    }

    /* JADX INFO: renamed from: c */
    public static String m9407c(InterfaceC7526i interfaceC7526i, Charset charset, int i10) {
        if ((i10 & 1) != 0) {
            charset = C21307a.f67720a;
        }
        AbstractC16544l.m18094g(interfaceC7526i, "<this>");
        AbstractC16544l.m18094g(charset, "charset");
        return charset.equals(C21307a.f67720a) ? AbstractC7527j.m7842h(interfaceC7526i) : AbstractC8120j6.m8624b(charset.newDecoder(), interfaceC7526i, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e */
    public static void m9409e(C7518a c7518a, CharSequence text) {
        int i10;
        int i11;
        long j10;
        int length = text.length();
        Charset charset = C21307a.f67720a;
        AbstractC16544l.m18094g(text, "text");
        AbstractC16544l.m18094g(charset, "charset");
        String string = text.toString();
        AbstractC16544l.m18094g(string, "string");
        AbstractC7527j.m7835a(string.length(), 0, length);
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = string.charAt(i12);
            if (cCharAt < 128) {
                C7524g c7524gM7824m = c7518a.m7824m(1);
                int i13 = -i12;
                int iMin = Math.min(length, c7524gM7824m.m7827a() + i12);
                i10 = i12 + 1;
                int i14 = c7524gM7824m.f23856c + i12 + i13;
                byte[] bArr = c7524gM7824m.f23854a;
                bArr[i14] = (byte) cCharAt;
                while (i10 < iMin) {
                    char cCharAt2 = string.charAt(i10);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[c7524gM7824m.f23856c + i10 + i13] = (byte) cCharAt2;
                    i10++;
                }
                int i15 = i13 + i10;
                if (i15 == 1) {
                    c7524gM7824m.f23856c += i15;
                    c7518a.f23841o0 += (long) i15;
                } else {
                    if (i15 < 0 || i15 > c7524gM7824m.m7827a()) {
                        StringBuilder sbM11057o = AbstractC10763a.m11057o(i15, "Invalid number of bytes written: ", ". Should be in 0..");
                        sbM11057o.append(c7524gM7824m.m7827a());
                        throw new IllegalStateException(sbM11057o.toString().toString());
                    }
                    if (i15 != 0) {
                        c7524gM7824m.f23856c += i15;
                        c7518a.f23841o0 += (long) i15;
                    } else if (AbstractC7527j.m7839e(c7524gM7824m)) {
                        c7518a.m7820e();
                    }
                }
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                    C7524g c7524gM7824m2 = c7518a.m7824m(2);
                    int i16 = c7524gM7824m2.f23856c;
                    byte[] bArr2 = c7524gM7824m2.f23854a;
                    bArr2[i16] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt & '?') | 128);
                    c7524gM7824m2.f23856c = i16 + 2;
                    j10 = c7518a.f23841o0;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                    C7524g c7524gM7824m3 = c7518a.m7824m(3);
                    int i17 = c7524gM7824m3.f23856c;
                    byte[] bArr3 = c7524gM7824m3.f23854a;
                    bArr3[i17] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt & '?') | 128);
                    c7524gM7824m3.f23856c = i17 + 3;
                    j10 = c7518a.f23841o0;
                } else {
                    i10 = i12 + 1;
                    char cCharAt3 = i10 < length ? string.charAt(i10) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        C7524g c7524gM7824m4 = c7518a.m7824m(1);
                        int i18 = c7524gM7824m4.f23856c;
                        c7524gM7824m4.f23856c = i18 + 1;
                        c7524gM7824m4.f23854a[i18] = 63;
                        c7518a.f23841o0++;
                    } else {
                        int i19 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C7524g c7524gM7824m5 = c7518a.m7824m(4);
                        int i20 = c7524gM7824m5.f23856c;
                        byte[] bArr4 = c7524gM7824m5.f23854a;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        c7524gM7824m5.f23856c = i20 + 4;
                        c7518a.f23841o0 += (long) 4;
                        i12 += 2;
                    }
                }
                c7518a.f23841o0 = j10 + ((long) i11);
                i12++;
            }
            i12 = i10;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m9408d(String str, Charset charset) throws CharacterCodingException {
        AbstractC16544l.m18094g(str, SfpOlmlMATQ.YlHncj);
        AbstractC16544l.m18094g(charset, "charset");
        Charset charset2 = C21307a.f67720a;
        if (!charset.equals(charset2)) {
            return AbstractC8112i6.m8604b(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        AbstractC9381v3.m9953a(0, length, str.length());
        CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            AbstractC16544l.m18091d(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                AbstractC16544l.m18091d(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }
}
