package com.statsig.androidsdk;

import android.content.SharedPreferences;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigUtil$removeFromSharedPrefs$2", m20656f = "StatsigUtil.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
public final class StatsigUtil$removeFromSharedPrefs$2 extends AbstractC19694j implements InterfaceC1439n {
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $sharedPrefs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigUtil$removeFromSharedPrefs$2(SharedPreferences sharedPreferences, String str, InterfaceC18770c<? super StatsigUtil$removeFromSharedPrefs$2> interfaceC18770c) {
        super(2, interfaceC18770c);
        this.$sharedPrefs = sharedPreferences;
        this.$key = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
        return new StatsigUtil$removeFromSharedPrefs$2(this.$sharedPrefs, this.$key, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        return ((StatsigUtil$removeFromSharedPrefs$2) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        SharedPreferences.Editor editorEdit = this.$sharedPrefs.edit();
        editorEdit.remove(this.$key);
        editorEdit.apply();
        return C17296C.f55119a;
    }
}
