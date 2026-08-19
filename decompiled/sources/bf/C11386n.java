package bf;

import ao.AbstractC11153a0;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11386n {
    public static final C11385m Companion = new C11385m();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f34400f = {null, null, null, EnumC11388p.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f34401a;

    /* JADX INFO: renamed from: b */
    public final String f34402b;

    /* JADX INFO: renamed from: c */
    public final String f34403c;

    /* JADX INFO: renamed from: d */
    public final EnumC11388p f34404d;

    /* JADX INFO: renamed from: e */
    public final boolean f34405e;

    public C11386n(String str, String siteName, String str2, EnumC11388p enumC11388p) {
        AbstractC16544l.m18094g(siteName, "siteName");
        AbstractC16544l.m18094g(str2, VjclRfeKsMflo.rfKfmNrWPAw);
        this.f34401a = str;
        this.f34402b = siteName;
        this.f34403c = str2;
        this.f34404d = enumC11388p;
        this.f34405e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11386n)) {
            return false;
        }
        C11386n c11386n = (C11386n) obj;
        return AbstractC16544l.m18089b(this.f34401a, c11386n.f34401a) && AbstractC16544l.m18089b(this.f34402b, c11386n.f34402b) && AbstractC16544l.m18089b(this.f34403c, c11386n.f34403c) && this.f34404d == c11386n.f34404d && this.f34405e == c11386n.f34405e;
    }

    public final int hashCode() {
        return ((this.f34404d.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(this.f34401a.hashCode() * 31, 31, this.f34402b), 31, this.f34403c)) * 31) + (this.f34405e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C11386n(int i10, String str, String str2, String str3, EnumC11388p enumC11388p, boolean z6) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C11384l.f34399a.getDescriptor());
            throw null;
        }
        this.f34401a = str;
        this.f34402b = str2;
        this.f34403c = str3;
        this.f34404d = enumC11388p;
        if ((i10 & 16) == 0) {
            this.f34405e = false;
        } else {
            this.f34405e = z6;
        }
    }
}
