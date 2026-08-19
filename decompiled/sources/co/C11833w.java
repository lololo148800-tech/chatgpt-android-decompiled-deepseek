package co;

import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16642a;

/* JADX INFO: renamed from: co.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C11833w extends AbstractC11811a {

    /* JADX INFO: renamed from: f */
    public final C16642a f35859f;

    /* JADX INFO: renamed from: g */
    public final int f35860g;

    /* JADX INFO: renamed from: h */
    public int f35861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11833w(AbstractC11516d json, C16642a value) {
        super(json, null);
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(value, "value");
        this.f35859f = value;
        this.f35860g = value.f53330Y.size();
        this.f35861h = -1;
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: G */
    public final AbstractC16643b mo13073G(String tag) {
        AbstractC16544l.m18094g(tag, "tag");
        return (AbstractC16643b) this.f35859f.f53330Y.get(Integer.parseInt(tag));
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: S */
    public final String mo13085S(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return String.valueOf(i10);
    }

    @Override // co.AbstractC11811a
    /* JADX INFO: renamed from: U */
    public final AbstractC16643b mo13087U() {
        return this.f35859f;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: s */
    public final int mo10914s(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        int i10 = this.f35861h;
        if (i10 >= this.f35860g - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f35861h = i11;
        return i11;
    }
}
