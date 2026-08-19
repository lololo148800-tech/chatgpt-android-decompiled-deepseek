package p112E6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: E6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2342a extends CancellationException {

    /* JADX INFO: renamed from: Y */
    public final C2346e f7270Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2342a(C2346e owner) {
        super("Flow was aborted, no more elements needed");
        AbstractC16544l.m18094g(owner, "owner");
        this.f7270Y = owner;
    }
}
