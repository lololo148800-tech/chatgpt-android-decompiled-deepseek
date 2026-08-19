package p523V9;

import bo.InterfaceC11522j;
import bo.InterfaceC11526n;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p077Cn.C1743k;
import p077Cn.C1746n;
import p077Cn.C1754v;
import p077Cn.EnumC1733a;
import p077Cn.InterfaceC1747o;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p867l8.C16831c;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: V9.W3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8017W3 {
    /* JADX INFO: renamed from: a */
    public static C1743k m8337a(int i10, int i11, EnumC1733a enumC1733a) {
        C1743k c1754v;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            enumC1733a = EnumC1733a.f4961Y;
        }
        if (i10 != -2) {
            if (i10 == -1) {
                if (enumC1733a == EnumC1733a.f4961Y) {
                    return new C1754v(1, EnumC1733a.f4962Z, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i10 == 0) {
                c1754v = enumC1733a == EnumC1733a.f4961Y ? new C1743k(0, null) : new C1754v(1, enumC1733a, null);
            } else {
                if (i10 != Integer.MAX_VALUE) {
                    return enumC1733a == EnumC1733a.f4961Y ? new C1743k(i10, null) : new C1754v(i10, enumC1733a, null);
                }
                c1754v = new C1743k(Integer.MAX_VALUE, null);
            }
        } else if (enumC1733a == EnumC1733a.f4961Y) {
            InterfaceC1747o.f5018a.getClass();
            c1754v = new C1743k(C1746n.f5017b, null);
        } else {
            c1754v = new C1754v(1, enumC1733a, null);
        }
        return c1754v;
    }

    /* JADX INFO: renamed from: b */
    public static final void m8338b(Encoder encoder) {
        AbstractC16544l.m18094g(encoder, "<this>");
        if ((encoder instanceof InterfaceC11526n ? (InterfaceC11526n) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC11522j m8339c(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "<this>");
        InterfaceC11522j interfaceC11522j = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
        if (interfaceC11522j != null) {
            return interfaceC11522j;
        }
        throw new IllegalStateException(AbstractC17792x.m19535r(AbstractC16526C.f51263a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    /* JADX INFO: renamed from: d */
    public static C16831c m8340d(C3676s c3676s) {
        try {
            if (c3676s.m4395w("format_version").mo4382p() == 2) {
                return new C16831c();
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dd", e12);
        }
    }
}
