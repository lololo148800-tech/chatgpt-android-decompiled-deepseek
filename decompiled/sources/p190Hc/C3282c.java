package p190Hc;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17627a;

/* JADX INFO: renamed from: Hc.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3282c {

    /* JADX INFO: renamed from: a */
    public final Set f10004a;

    /* JADX INFO: renamed from: b */
    public final Set f10005b;

    /* JADX INFO: renamed from: c */
    public final C17627a f10006c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f10007d;

    public C3282c(Set initializers, Set priorityInitializers, C17627a scope) {
        AbstractC16544l.m18094g(initializers, "initializers");
        AbstractC16544l.m18094g(priorityInitializers, "priorityInitializers");
        AbstractC16544l.m18094g(scope, "scope");
        this.f10004a = initializers;
        this.f10005b = priorityInitializers;
        this.f10006c = scope;
        this.f10007d = new AtomicBoolean(false);
    }
}
