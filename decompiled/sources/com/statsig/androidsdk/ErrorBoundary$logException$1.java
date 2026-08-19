package com.statsig.androidsdk;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p214Ib.C3669l;
import p523V9.AbstractC7942M5;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.statsig.androidsdk.ErrorBoundary$logException$1", m20656f = "ErrorBoundary.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
public final class ErrorBoundary$logException$1 extends AbstractC19694j implements InterfaceC1439n {
    final /* synthetic */ Throwable $exception;
    int label;
    final /* synthetic */ ErrorBoundary this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorBoundary$logException$1(ErrorBoundary errorBoundary, Throwable th2, InterfaceC18770c<? super ErrorBoundary$logException$1> interfaceC18770c) {
        super(2, interfaceC18770c);
        this.this$0 = errorBoundary;
        this.$exception = th2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
        return new ErrorBoundary$logException$1(this.this$0, this.$exception, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        return ((ErrorBoundary$logException$1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        String str = this.this$0.apiKey;
        C17296C c17296c = C17296C.f55119a;
        if (str == null) {
            return c17296c;
        }
        String canonicalName = this.$exception.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = this.$exception.getClass().getName();
        }
        if (this.this$0.seen.contains(canonicalName)) {
            return c17296c;
        }
        this.this$0.seen.add(canonicalName);
        StatsigMetadata statsigMetadata = this.this$0.statsigMetadata;
        if (statsigMetadata == null) {
            statsigMetadata = new StatsigMetadata("", null, null, null, null, null, null, null, null, null, null, null, 4094, null);
        }
        URL url = new URL(this.this$0.getUrlString());
        String strM4375i = new C3669l().m4375i(AbstractC17659D.m19244f(new C17309l("exception", canonicalName), new C17309l(ParameterNames.INFO, AbstractC9221V.m9790b(new RuntimeException(this.$exception))), new C17309l("statsigMetadata", statsigMetadata)));
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("STATSIG-API-KEY", this.this$0.apiKey);
        httpURLConnection.setUseCaches(false);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.writeBytes(strM4375i);
            AbstractC7942M5.m8232a(dataOutputStream, null);
            httpURLConnection.getResponseCode();
            return c17296c;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(dataOutputStream, th2);
                throw th3;
            }
        }
    }
}
