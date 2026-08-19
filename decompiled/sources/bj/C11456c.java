package bj;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: bj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11456c extends AbstractC11457d {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f34641h;

    /* JADX INFO: renamed from: i */
    public AbstractC11471r f34642i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Type[] f34643j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Type f34644k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Set f34645l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Set f34646m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11456c(Type type, Set set, Object obj, Method method, int i10, boolean z6, Type[] typeArr, Type type2, Set set2, Set set3, int i11) {
        super(type, set, obj, method, i10, 1, z6);
        this.f34641h = i11;
        this.f34643j = typeArr;
        this.f34644k = type2;
        this.f34645l = set2;
        this.f34646m = set3;
    }

    @Override // bj.AbstractC11457d
    /* JADX INFO: renamed from: a */
    public final void mo12861a(C11447L c11447l, C11458e c11458e) {
        switch (this.f34641h) {
            case 0:
                super.mo12861a(c11447l, c11458e);
                Type type = this.f34643j[0];
                Type type2 = this.f34644k;
                boolean zM12853b = AbstractC11452Q.m12853b(type, type2);
                Set set = this.f34646m;
                this.f34642i = (zM12853b && this.f34645l.equals(set)) ? c11447l.m12851c(c11458e, type2, set) : c11447l.m12850b(type2, set, null);
                break;
            default:
                super.mo12861a(c11447l, c11458e);
                Type[] typeArr = this.f34643j;
                boolean zM12853b2 = AbstractC11452Q.m12853b(typeArr[0], this.f34644k);
                Set set2 = this.f34645l;
                this.f34642i = (zM12853b2 && set2.equals(this.f34646m)) ? c11447l.m12851c(c11458e, typeArr[0], set2) : c11447l.m12850b(typeArr[0], set2, null);
                break;
        }
    }

    @Override // bj.AbstractC11457d
    /* JADX INFO: renamed from: b */
    public Object mo12859b(AbstractC11477x abstractC11477x) {
        switch (this.f34641h) {
            case 1:
                return m12862c(this.f34642i.fromJson(abstractC11477x));
            default:
                return super.mo12859b(abstractC11477x);
        }
    }

    @Override // bj.AbstractC11457d
    /* JADX INFO: renamed from: d */
    public void mo12860d(AbstractC11440E abstractC11440E, Object obj) {
        switch (this.f34641h) {
            case 0:
                this.f34642i.toJson(abstractC11440E, m12862c(obj));
                break;
            default:
                super.mo12860d(abstractC11440E, obj);
                break;
        }
    }
}
