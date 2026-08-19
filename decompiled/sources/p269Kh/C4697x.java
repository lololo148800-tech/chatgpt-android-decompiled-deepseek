package p269Kh;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Kh.x */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C4697x {
    public static final C4696w Companion = new C4696w();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f15274d = {AbstractC11153a0.m12383f("com.openai.models.model.Models.ProductFeatures.AttachmentType", EnumC4694u.values()), new C11158d(C11181o0.f33827a, 0), null};

    /* JADX INFO: renamed from: a */
    public final EnumC4694u f15275a;

    /* JADX INFO: renamed from: b */
    public final List f15276b;

    /* JADX INFO: renamed from: c */
    public final boolean f15277c;

    public /* synthetic */ C4697x(int i10, EnumC4694u enumC4694u, List list, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C4695v.f15273a.getDescriptor());
            throw null;
        }
        this.f15275a = enumC4694u;
        if ((i10 & 2) == 0) {
            this.f15276b = C17689w.f56480Y;
        } else {
            this.f15276b = list;
        }
        if ((i10 & 4) == 0) {
            this.f15277c = false;
        } else {
            this.f15277c = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4697x)) {
            return false;
        }
        C4697x c4697x = (C4697x) obj;
        return this.f15275a == c4697x.f15275a && AbstractC16544l.m18089b(this.f15276b, c4697x.f15276b) && this.f15277c == c4697x.f15277c;
    }

    public final int hashCode() {
        return AbstractC14376f.m15858x(this.f15276b, this.f15275a.hashCode() * 31, 31) + (this.f15277c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C4697x(EnumC4694u enumC4694u, List acceptedMimeTypes, boolean z6) {
        AbstractC16544l.m18094g(acceptedMimeTypes, "acceptedMimeTypes");
        this.f15275a = enumC4694u;
        this.f15276b = acceptedMimeTypes;
        this.f15277c = z6;
    }
}
