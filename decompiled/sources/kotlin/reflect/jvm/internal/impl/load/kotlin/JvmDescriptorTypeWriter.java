package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a */
    public int f52059a;

    /* JADX INFO: renamed from: b */
    public Object f52060b;

    /* JADX INFO: renamed from: a */
    public final void m18245a(Object type) {
        AbstractC16544l.m18094g(type, "type");
        if (this.f52060b == null) {
            int i10 = this.f52059a;
            if (i10 <= 0) {
                this.f52060b = type;
            } else {
                AbstractC21329w.m21729p(i10, "[");
                throw null;
            }
        }
    }

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.f52060b == null) {
            this.f52059a++;
        }
    }

    public void writeClass(T objectType) {
        AbstractC16544l.m18094g(objectType, "objectType");
        m18245a(objectType);
    }

    public void writeTypeVariable(Name name, T type) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(type, "type");
        m18245a(type);
    }
}
