package p1091wn;

import io.ktor.client.plugins.auth.C15058c;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1112xm.AbstractC21298b;
import p1112xm.AbstractC21302f;
import p1112xm.C21299c;
import p1112xm.C21300d;
import p1112xm.C21301e;
import p1112xm.EnumC21303g;
import p909nm.AbstractC17668b;

/* JADX INFO: renamed from: wn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C21021b extends AbstractC17668b {

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f66887o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public final Object f66888p0;

    /* JADX INFO: renamed from: q0 */
    public final Object f66889q0;

    public C21021b(Iterator source, C15058c c15058c) {
        AbstractC16544l.m18094g(source, "source");
        this.f66888p0 = source;
        this.f66889q0 = new HashSet();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p909nm.AbstractC17668b
    /* JADX INFO: renamed from: a */
    public final void mo18444a() {
        Object next;
        File file;
        switch (this.f66887o0) {
            case 0:
                do {
                    Iterator it = (Iterator) this.f66888p0;
                    if (!it.hasNext()) {
                        this.f56465Y = 2;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((HashSet) this.f66889q0).add(next));
                this.f56466Z = next;
                this.f56465Y = 1;
                break;
            default:
                while (true) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f66888p0;
                    AbstractC21302f abstractC21302f = (AbstractC21302f) arrayDeque.peek();
                    if (abstractC21302f == null) {
                        file = null;
                    } else {
                        File fileMo21639a = abstractC21302f.mo21639a();
                        if (fileMo21639a == null) {
                            arrayDeque.pop();
                        } else {
                            if (!fileMo21639a.equals(abstractC21302f.f67712a) && fileMo21639a.isDirectory()) {
                                int size = arrayDeque.size();
                                ((C21022c) this.f66889q0).getClass();
                                if (size < Integer.MAX_VALUE) {
                                    arrayDeque.push(m21474b(fileMo21639a));
                                }
                            }
                            file = fileMo21639a;
                        }
                    }
                }
                if (file == null) {
                    this.f56465Y = 2;
                } else {
                    this.f56466Z = file;
                    this.f56465Y = 1;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public AbstractC21298b m21474b(File file) {
        int iOrdinal = ((EnumC21303g) ((C21022c) this.f66889q0).f66892c).ordinal();
        if (iOrdinal == 0) {
            return new C21301e(this, file);
        }
        if (iOrdinal == 1) {
            return new C21299c(this, file);
        }
        throw new C0644w();
    }

    public C21021b(C21022c c21022c) {
        this.f66889q0 = c21022c;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f66888p0 = arrayDeque;
        if (((File) c21022c.f66891b).isDirectory()) {
            arrayDeque.push(m21474b((File) c21022c.f66891b));
        } else {
            if (((File) c21022c.f66891b).isFile()) {
                File rootFile = (File) c21022c.f66891b;
                AbstractC16544l.m18094g(rootFile, "rootFile");
                arrayDeque.push(new C21300d(rootFile));
                return;
            }
            this.f56465Y = 2;
        }
    }
}
