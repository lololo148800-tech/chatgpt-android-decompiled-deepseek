package p214Ib;

import com.auth0.android.request.internal.InterfaceC11848g;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p379Pb.C6381b;
import p379Pb.C6382c;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Ib.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3667j extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC3656B f11146b;

    public /* synthetic */ C3667j(AbstractC3656B abstractC3656B, int i10) {
        this.f11145a = i10;
        this.f11146b = abstractC3656B;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        switch (this.f11145a) {
            case 0:
                return new AtomicLong(((Number) this.f11146b.mo4358a(c6381b)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c6381b.mo5621a();
                while (c6381b.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) this.f11146b.mo4358a(c6381b)).longValue()));
                }
                c6381b.mo5614E();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            case 2:
                if (c6381b.mo5616N0() != 9) {
                    return this.f11146b.mo4358a(c6381b);
                }
                c6381b.mo5627e0();
                return null;
            default:
                Object objMo4358a = this.f11146b.mo4358a(c6381b);
                for (Field field : objMo4358a.getClass().getDeclaredFields()) {
                    if (field != null && field.getAnnotation(InterfaceC11848g.class) != null) {
                        try {
                            field.setAccessible(true);
                            if (field.get(objMo4358a) == null) {
                                throw new C3677t("Missing required attribute " + field.getName());
                            }
                        } catch (IllegalAccessException unused) {
                            throw new C3677t(AbstractC9306j0.m9889h("Missing required attribute ", field.getName()));
                        }
                    }
                }
                return objMo4358a;
        }
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        switch (this.f11145a) {
            case 0:
                this.f11146b.mo4359b(c6382c, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c6382c.m7018e();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f11146b.mo4359b(c6382c, Long.valueOf(atomicLongArray.get(i10)));
                }
                c6382c.m7008E();
                break;
            case 2:
                if (obj == null) {
                    c6382c.m7016W();
                } else {
                    this.f11146b.mo4359b(c6382c, obj);
                }
                break;
            default:
                this.f11146b.mo4359b(c6382c, obj);
                break;
        }
    }
}
