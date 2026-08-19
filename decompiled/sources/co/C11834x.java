package co;

import bo.AbstractC11516d;
import bo.AbstractC11523k;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: co.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C11834x extends C11832v {

    /* JADX INFO: renamed from: j */
    public final C16644c f35862j;

    /* JADX INFO: renamed from: k */
    public final List f35863k;

    /* JADX INFO: renamed from: l */
    public final int f35864l;

    /* JADX INFO: renamed from: m */
    public int f35865m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11834x(AbstractC11516d json, C16644c value) {
        super(json, value, (String) null, 12);
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(value, "value");
        this.f35862j = value;
        List listM19322C0 = AbstractC17680n.m19322C0(value.f53331Y.keySet());
        this.f35863k = listM19322C0;
        this.f35864l = listM19322C0.size() * 2;
        this.f35865m = -1;
    }

    @Override // co.C11832v, co.AbstractC11811a
    /* JADX INFO: renamed from: G */
    public final AbstractC16643b mo13073G(String tag) {
        AbstractC16544l.m18094g(tag, "tag");
        return this.f35865m % 2 == 0 ? AbstractC11523k.m12910c(tag) : (AbstractC16643b) AbstractC17659D.m19243e(this.f35862j, tag);
    }

    @Override // co.C11832v, co.AbstractC11811a
    /* JADX INFO: renamed from: S */
    public final String mo13085S(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return (String) this.f35863k.get(i10 / 2);
    }

    @Override // co.C11832v, co.AbstractC11811a
    /* JADX INFO: renamed from: U */
    public final AbstractC16643b mo13087U() {
        return this.f35862j;
    }

    @Override // co.C11832v
    /* JADX INFO: renamed from: Z */
    public final C16644c mo13087U() {
        return this.f35862j;
    }

    @Override // co.C11832v, co.AbstractC11811a, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: b */
    public final void mo5470b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }

    @Override // co.C11832v, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public final int mo10914s(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        int i10 = this.f35865m;
        if (i10 >= this.f35864l - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f35865m = i11;
        return i11;
    }
}
