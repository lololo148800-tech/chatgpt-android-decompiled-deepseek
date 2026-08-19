package p1089wl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1440o;
import p265Kb.C4612e;
import p610Z1.C10135b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p972qm.InterfaceC18776i;
import sl.C19675j;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: wl.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21010d {
    private volatile /* synthetic */ Object _interceptors;

    /* JADX INFO: renamed from: a */
    public final ArrayList f66868a;

    /* JADX INFO: renamed from: b */
    public int f66869b;

    /* JADX INFO: renamed from: c */
    public boolean f66870c;

    /* JADX INFO: renamed from: d */
    public C4612e f66871d;

    public AbstractC21010d(C4612e... c4612eArr) {
        new C19675j();
        this.f66868a = AbstractC17681o.m19384m(Arrays.copyOf(c4612eArr, c4612eArr.length));
        this._interceptors = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[LOOP:2: B:33:0x007d->B:34:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:1: B:26:0x005b->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:37:0x008e BREAK  A[LOOP:1: B:26:0x005b->B:36:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m21467a(Object context, Object subject, AbstractC19687c abstractC19687c) {
        ArrayList arrayList;
        int iM19381j;
        int i10;
        Object obj;
        C21009c c21009c;
        List list;
        int size;
        int i11;
        int iM19381j2;
        InterfaceC18776i coroutineContext = abstractC19687c.getContext();
        if (((List) this._interceptors) == null) {
            int i12 = this.f66869b;
            if (i12 == 0) {
                this._interceptors = C17689w.f56480Y;
                this.f66870c = false;
                this.f66871d = null;
            } else {
                ArrayList arrayList2 = this.f66868a;
                if (i12 != 1 || (iM19381j2 = AbstractC17681o.m19381j(arrayList2)) < 0) {
                    arrayList = new ArrayList();
                    iM19381j = AbstractC17681o.m19381j(arrayList2);
                    if (iM19381j >= 0) {
                        i10 = 0;
                        while (true) {
                            obj = arrayList2.get(i10);
                            if (obj instanceof C21009c) {
                                c21009c = (C21009c) obj;
                            } else {
                                c21009c = null;
                            }
                            if (c21009c != null) {
                                list = c21009c.f66866c;
                                arrayList.ensureCapacity(list.size() + arrayList.size());
                                size = list.size();
                                for (i11 = 0; i11 < size; i11++) {
                                    arrayList.add(list.get(i11));
                                }
                            }
                            if (i10 != iM19381j) {
                                break;
                            }
                            i10++;
                        }
                    }
                    this._interceptors = arrayList;
                    this.f66870c = false;
                    this.f66871d = null;
                } else {
                    int i13 = 0;
                    while (true) {
                        Object obj2 = arrayList2.get(i13);
                        C21009c c21009c2 = obj2 instanceof C21009c ? (C21009c) obj2 : null;
                        if (c21009c2 != null && !c21009c2.f66866c.isEmpty()) {
                            List list2 = c21009c2.f66866c;
                            c21009c2.f66867d = true;
                            this._interceptors = list2;
                            this.f66870c = false;
                            this.f66871d = c21009c2.f66864a;
                        } else if (i13 != iM19381j2) {
                            i13++;
                        } else {
                            arrayList = new ArrayList();
                            iM19381j = AbstractC17681o.m19381j(arrayList2);
                            if (iM19381j >= 0) {
                                i10 = 0;
                                while (true) {
                                    obj = arrayList2.get(i10);
                                    if (obj instanceof C21009c) {
                                        c21009c = (C21009c) obj;
                                    } else {
                                        c21009c = null;
                                    }
                                    if (c21009c != null) {
                                        list = c21009c.f66866c;
                                        arrayList.ensureCapacity(list.size() + arrayList.size());
                                        size = list.size();
                                        while (i11 < size) {
                                            arrayList.add(list.get(i11));
                                        }
                                    }
                                    if (i10 != iM19381j) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            this._interceptors = arrayList;
                            this.f66870c = false;
                            this.f66871d = null;
                        }
                    }
                }
            }
        }
        this.f66870c = true;
        List list3 = (List) this._interceptors;
        AbstractC16544l.m18091d(list3);
        boolean zMo15174d = mo15174d();
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(subject, "subject");
        AbstractC16544l.m18094g(coroutineContext, "coroutineContext");
        return ((AbstractC21012f.f66873a || zMo15174d) ? new C21008b(context, list3, subject, coroutineContext) : new C21018l(subject, context, list3)).mo21462a(subject, abstractC19687c);
    }

    /* JADX INFO: renamed from: b */
    public final C21009c m21468b(C4612e c4612e) {
        ArrayList arrayList = this.f66868a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == c4612e) {
                C21009c c21009c = new C21009c(c4612e, C21015i.f66875b);
                arrayList.set(i10, c21009c);
                return c21009c;
            }
            if (obj instanceof C21009c) {
                C21009c c21009c2 = (C21009c) obj;
                if (c21009c2.f66864a == c4612e) {
                    return c21009c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m21469c(C4612e c4612e) {
        ArrayList arrayList = this.f66868a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == c4612e || ((obj instanceof C21009c) && ((C21009c) obj).f66864a == c4612e)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo15174d();

    /* JADX INFO: renamed from: e */
    public final boolean m21470e(C4612e c4612e) {
        ArrayList arrayList = this.f66868a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == c4612e) {
                return true;
            }
            if ((obj instanceof C21009c) && ((C21009c) obj).f66864a == c4612e) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21471f(C4612e phase, InterfaceC1440o interfaceC1440o) {
        AbstractC16544l.m18094g(phase, "phase");
        C21009c c21009cM21468b = m21468b(phase);
        if (c21009cM21468b == null) {
            throw new C10135b("Phase " + phase + " was not registered for this pipeline");
        }
        List list = (List) this._interceptors;
        if (!this.f66868a.isEmpty() && list != null && !this.f66870c && AbstractC16529F.m18083g(list)) {
            if (AbstractC16544l.m18089b(this.f66871d, phase)) {
                list.add(interfaceC1440o);
            } else if (phase.equals(AbstractC17680n.m19351a0(this.f66868a)) || m21469c(phase) == AbstractC17681o.m19381j(this.f66868a)) {
                C21009c c21009cM21468b2 = m21468b(phase);
                AbstractC16544l.m18091d(c21009cM21468b2);
                if (c21009cM21468b2.f66867d) {
                    c21009cM21468b2.f66866c = AbstractC17680n.m19323D0(c21009cM21468b2.f66866c);
                    c21009cM21468b2.f66867d = false;
                }
                c21009cM21468b2.f66866c.add(interfaceC1440o);
                list.add(interfaceC1440o);
            }
            this.f66869b++;
            return;
        }
        if (c21009cM21468b.f66867d) {
            c21009cM21468b.f66866c = AbstractC17680n.m19323D0(c21009cM21468b.f66866c);
            c21009cM21468b.f66867d = false;
        }
        c21009cM21468b.f66866c.add(interfaceC1440o);
        this.f66869b++;
        this._interceptors = null;
        this.f66870c = false;
        this.f66871d = null;
    }
}
