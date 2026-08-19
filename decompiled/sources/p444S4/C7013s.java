package p444S4;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p658b5.C11245p;

/* JADX INFO: renamed from: S4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C7013s {

    /* JADX INFO: renamed from: a */
    public final UUID f22424a;

    /* JADX INFO: renamed from: b */
    public final C11245p f22425b;

    /* JADX INFO: renamed from: c */
    public final Set f22426c;

    public C7013s(UUID id2, C11245p workSpec, Set tags) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(workSpec, "workSpec");
        AbstractC16544l.m18094g(tags, "tags");
        this.f22424a = id2;
        this.f22425b = workSpec;
        this.f22426c = tags;
    }
}
