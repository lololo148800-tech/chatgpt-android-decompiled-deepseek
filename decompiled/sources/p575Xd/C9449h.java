package p575Xd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9449h implements InterfaceC9461t {
    public static final C9448g Companion = new C9448g();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f28454d = {null, AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.AllowAction.ActionName", EnumC9447f.values()), null};

    /* JADX INFO: renamed from: a */
    public final String f28455a;

    /* JADX INFO: renamed from: b */
    public final EnumC9447f f28456b;

    /* JADX INFO: renamed from: c */
    public final String f28457c;

    public C9449h(String str, EnumC9447f name, String str2) {
        AbstractC16544l.m18094g(name, "name");
        this.f28455a = str;
        this.f28456b = name;
        this.f28457c = str2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9449h)) {
            return false;
        }
        C9449h c9449h = (C9449h) obj;
        if (!AbstractC16544l.m18089b(this.f28455a, c9449h.f28455a) || this.f28456b != c9449h.f28456b) {
            return false;
        }
        String str = this.f28457c;
        String str2 = c9449h.f28457c;
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
        String str = this.f28455a;
        int iHashCode = (this.f28456b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f28457c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9449h(int i10, String str, EnumC9447f enumC9447f, String str2) {
        if ((i10 & 1) == 0) {
            this.f28455a = null;
        } else {
            this.f28455a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28456b = EnumC9447f.f28451Z;
        } else {
            this.f28456b = enumC9447f;
        }
        if ((i10 & 4) == 0) {
            this.f28457c = null;
        } else {
            this.f28457c = str2;
        }
    }
}
