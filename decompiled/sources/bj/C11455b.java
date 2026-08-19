package bj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: bj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11455b extends AbstractC11457d {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f34640h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11455b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z6, int i12) {
        super(type, set, obj, method, i10, i11, z6);
        this.f34640h = i12;
    }

    @Override // bj.AbstractC11457d
    /* JADX INFO: renamed from: b */
    public Object mo12859b(AbstractC11477x abstractC11477x) {
        switch (this.f34640h) {
            case 1:
                return m12862c(abstractC11477x);
            default:
                return super.mo12859b(abstractC11477x);
        }
    }

    @Override // bj.AbstractC11457d
    /* JADX INFO: renamed from: d */
    public void mo12860d(AbstractC11440E abstractC11440E, Object obj) throws InvocationTargetException {
        switch (this.f34640h) {
            case 0:
                AbstractC11471r[] abstractC11471rArr = this.f34652f;
                Object[] objArr = new Object[abstractC11471rArr.length + 2];
                objArr[0] = abstractC11440E;
                objArr[1] = obj;
                System.arraycopy(abstractC11471rArr, 0, objArr, 2, abstractC11471rArr.length);
                try {
                    this.f34650d.invoke(this.f34649c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.mo12860d(abstractC11440E, obj);
                return;
        }
    }
}
