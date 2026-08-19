package p474T8;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: T8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7277o implements InterfaceC7269g {

    /* JADX INFO: renamed from: a */
    public final String f23068a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7272j f23069b;

    public C7277o(String permission, InterfaceC7272j status) {
        AbstractC16544l.m18094g(permission, "permission");
        AbstractC16544l.m18094g(status, "status");
        this.f23068a = permission;
        this.f23069b = status;
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: a */
    public final InterfaceC7272j mo7726a() {
        return this.f23069b;
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: c */
    public final String mo7728c() {
        return this.f23068a;
    }

    @Override // p474T8.InterfaceC7269g
    /* JADX INFO: renamed from: b */
    public final void mo7727b() {
    }
}
