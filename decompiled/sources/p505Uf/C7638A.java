package p505Uf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7638A implements InterfaceC7639B {
    public static final C7665z Companion = new C7665z();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f24148d = {EnumC7643d.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC7643d f24149a;

    /* JADX INFO: renamed from: b */
    public final String f24150b;

    /* JADX INFO: renamed from: c */
    public final int f24151c;

    public /* synthetic */ C7638A(int i10, EnumC7643d enumC7643d, String str, int i11) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C7664y.f24187a.getDescriptor());
            throw null;
        }
        this.f24149a = enumC7643d;
        this.f24150b = str;
        this.f24151c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7638A)) {
            return false;
        }
        C7638A c7638a = (C7638A) obj;
        return this.f24149a == c7638a.f24149a && AbstractC16544l.m18089b(this.f24150b, c7638a.f24150b) && this.f24151c == c7638a.f24151c;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(this.f24149a.hashCode() * 31, 31, this.f24150b) + this.f24151c;
    }

    public final String toString() {
        return "█";
    }

    public C7638A(EnumC7643d channelId, String channelName, int i10) {
        AbstractC16544l.m18094g(channelId, "channelId");
        AbstractC16544l.m18094g(channelName, "channelName");
        this.f24149a = channelId;
        this.f24150b = channelName;
        this.f24151c = i10;
    }
}
