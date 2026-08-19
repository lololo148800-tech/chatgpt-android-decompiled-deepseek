package p118Ec;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17636j;

/* JADX INFO: renamed from: Ec.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2399c {

    /* JADX INFO: renamed from: a */
    public final Set f7462a;

    /* JADX INFO: renamed from: b */
    public final C17636j f7463b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f7464c;

    public C2399c(Set initializers, C17636j scope) {
        AbstractC16544l.m18094g(initializers, "initializers");
        AbstractC16544l.m18094g(scope, "scope");
        this.f7462a = initializers;
        this.f7463b = scope;
        this.f7464c = new AtomicBoolean(false);
    }
}
