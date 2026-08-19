package p148Fi;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11181o0;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1155zi.C21900C0;
import p1155zi.C21908E0;
import p1155zi.C21919H;
import p1155zi.C21940M0;
import p1155zi.C21947O;
import p1155zi.C21965U0;
import p1155zi.C22063u0;
import p1155zi.C22071w0;
import p1155zi.InterfaceC21915G;
import p225Im.InterfaceC3756d;
import p559Wn.C8974f;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.X */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2797X extends AbstractC2841n {
    public static final C2795W Companion = new C2795W();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f8523d;

    /* JADX INFO: renamed from: a */
    public final String f8524a;

    /* JADX INFO: renamed from: b */
    public final String f8525b;

    /* JADX INFO: renamed from: c */
    public final Map f8526c;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        C16527D c16527d = AbstractC16526C.f51263a;
        f8523d = new KSerializer[]{null, null, new C11131E(c11181o0, new C8974f("com.openai.types.AttachmentAssetPointer", c16527d.mo5693b(InterfaceC21915G.class), new InterfaceC3756d[]{c16527d.mo5693b(C21947O.class), c16527d.mo5693b(C22071w0.class), c16527d.mo5693b(C21908E0.class), c16527d.mo5693b(C21965U0.class)}, new KSerializer[]{C21919H.f69470a, C22063u0.f69764a, C21900C0.f69434a, C21940M0.f69493a}, new Annotation[0]), 1)};
    }

    public C2797X(int i10, String str, String str2, Map map) {
        if (4 != (i10 & 4)) {
            AbstractC11153a0.m12389l(i10, 4, C2793V.f8520a.getDescriptor());
            throw null;
        }
        this.f8524a = (i10 & 1) == 0 ? "turn_context" : str;
        if ((i10 & 2) == 0) {
            this.f8525b = "add";
        } else {
            this.f8525b = str2;
        }
        this.f8526c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2797X)) {
            return false;
        }
        C2797X c2797x = (C2797X) obj;
        return AbstractC16544l.m18089b(this.f8524a, c2797x.f8524a) && AbstractC16544l.m18089b(this.f8525b, c2797x.f8525b) && AbstractC16544l.m18089b(this.f8526c, c2797x.f8526c);
    }

    public final int hashCode() {
        return this.f8526c.hashCode() + AbstractC0168G.m527p(this.f8524a.hashCode() * 31, 31, this.f8525b);
    }

    public final String toString() {
        return "█";
    }

    public C2797X(Map map) {
        this.f8524a = "turn_context";
        this.f8525b = "add";
        this.f8526c = map;
    }
}
