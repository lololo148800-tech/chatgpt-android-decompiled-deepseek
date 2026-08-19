package p675c6;

import java.util.Arrays;
import java.util.List;
import p520V5.C7781j;
import p520V5.C7794w;
import p567X5.C9054d;
import p567X5.InterfaceC9053c;
import p698d6.AbstractC13029b;

/* JADX INFO: renamed from: c6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11678m implements InterfaceC11667b {

    /* JADX INFO: renamed from: a */
    public final String f35387a;

    /* JADX INFO: renamed from: b */
    public final List f35388b;

    /* JADX INFO: renamed from: c */
    public final boolean f35389c;

    public C11678m(String str, List list, boolean z6) {
        this.f35387a = str;
        this.f35388b = list;
        this.f35389c = z6;
    }

    @Override // p675c6.InterfaceC11667b
    /* JADX INFO: renamed from: a */
    public final InterfaceC9053c mo12679a(C7794w c7794w, C7781j c7781j, AbstractC13029b abstractC13029b) {
        return new C9054d(c7794w, abstractC13029b, this, c7781j);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f35387a + "' Shapes: " + Arrays.toString(this.f35388b.toArray()) + '}';
    }
}
