package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.p */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9457p implements InterfaceC9461t {
    public static final C9456o Companion = new C9456o();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f28468d = {null, AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.DenyAction.ActionName", EnumC9455n.values()), null};

    /* JADX INFO: renamed from: a */
    public final String f28469a;

    /* JADX INFO: renamed from: b */
    public final EnumC9455n f28470b;

    /* JADX INFO: renamed from: c */
    public final String f28471c;

    public C9457p(String str, EnumC9455n name, String str2) {
        AbstractC16544l.m18094g(name, "name");
        this.f28469a = str;
        this.f28470b = name;
        this.f28471c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9457p)) {
            return false;
        }
        C9457p c9457p = (C9457p) obj;
        if (!AbstractC16544l.m18089b(this.f28469a, c9457p.f28469a) || this.f28470b != c9457p.f28470b) {
            return false;
        }
        String str = this.f28471c;
        String str2 = c9457p.f28471c;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b;
    }

    public final int hashCode() {
        String str = this.f28469a;
        int iHashCode = (this.f28470b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f28471c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9457p(int i10, String str, EnumC9455n enumC9455n, String str2) {
        if ((i10 & 1) == 0) {
            this.f28469a = null;
        } else {
            this.f28469a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28470b = EnumC9455n.f28465Z;
        } else {
            this.f28470b = enumC9455n;
        }
        if ((i10 & 4) == 0) {
            this.f28471c = null;
        } else {
            this.f28471c = str2;
        }
    }
}
