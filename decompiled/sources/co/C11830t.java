package co;

import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import p138F8.vJO.anhfj;

/* JADX INFO: renamed from: co.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C11830t extends AbstractC11811a {

    /* JADX INFO: renamed from: f */
    public final AbstractC16643b f35846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830t(AbstractC11516d json, AbstractC16643b value, String str) {
        super(json, str);
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(value, "value");
        this.f35846f = value;
        this.f35806a.add("primitive");
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: U */
    public final AbstractC16643b mo13087U() {
        return this.f35846f;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public final int mo10914s(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return 0;
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: G */
    public final AbstractC16643b mo13073G(String tag) {
        AbstractC16544l.m18094g(tag, "tag");
        if (tag == anhfj.JLCUxBnAxxZVbA) {
            return this.f35846f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }
}
