package p110E4;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import p207I4.InterfaceC3616c;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: E4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2304b {

    /* JADX INFO: renamed from: a */
    public final Context f7142a;

    /* JADX INFO: renamed from: b */
    public final String f7143b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3616c f7144c;

    /* JADX INFO: renamed from: d */
    public final C2312j f7145d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f7146e;

    /* JADX INFO: renamed from: f */
    public final boolean f7147f;

    /* JADX INFO: renamed from: g */
    public final int f7148g;

    /* JADX INFO: renamed from: h */
    public final Executor f7149h;

    /* JADX INFO: renamed from: i */
    public final Executor f7150i;

    /* JADX INFO: renamed from: j */
    public final boolean f7151j;

    /* JADX INFO: renamed from: k */
    public final boolean f7152k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashSet f7153l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f7154m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f7155n;

    public C2304b(Context context, String str, InterfaceC3616c interfaceC3616c, C2312j migrationContainer, ArrayList arrayList, boolean z6, int i10, Executor queryExecutor, Executor transactionExecutor, boolean z10, boolean z11, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        AbstractC16544l.m18094g(migrationContainer, "migrationContainer");
        AbstractC14376f.m15825D(i10, "journalMode");
        AbstractC16544l.m18094g(queryExecutor, "queryExecutor");
        AbstractC16544l.m18094g(transactionExecutor, "transactionExecutor");
        AbstractC16544l.m18094g(typeConverters, "typeConverters");
        AbstractC16544l.m18094g(autoMigrationSpecs, "autoMigrationSpecs");
        this.f7142a = context;
        this.f7143b = str;
        this.f7144c = interfaceC3616c;
        this.f7145d = migrationContainer;
        this.f7146e = arrayList;
        this.f7147f = z6;
        this.f7148g = i10;
        this.f7149h = queryExecutor;
        this.f7150i = transactionExecutor;
        this.f7151j = z10;
        this.f7152k = z11;
        this.f7153l = linkedHashSet;
        this.f7154m = typeConverters;
        this.f7155n = autoMigrationSpecs;
    }
}
