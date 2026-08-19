package com.statsig.androidsdk;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.PrintStream;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0565C;
import p025An.InterfaceC0567D;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0011\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"JS\u0010*\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u001e\b\u0002\u0010)\u001a\u0018\u0012\f\u0012\n\u0018\u00010'j\u0004\u0018\u0001`(\u0012\u0004\u0012\u00020\u0006\u0018\u00010&2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010+J9\u0010.\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010,2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J_\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010,2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\u0006\u0012\u0004\u0018\u00010\u00010&2&\u0010)\u001a\"\b\u0001\u0012\b\u0012\u00060'j\u0002`(\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\u0006\u0012\u0004\u0018\u00010\u000100H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u00101J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b2\u0010\bR\"\u00104\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0017\"\u0004\b7\u0010\u0015R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00108R&\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\t09j\b\u0012\u0004\u0012\u00020\t`:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, m18067d2 = {"Lcom/statsig/androidsdk/ErrorBoundary;", "", "<init>", "()V", "", "exception", "Lmm/C;", "handleException", "(Ljava/lang/Throwable;)V", "", ParameterNames.TAG, "configName", "startMarker", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "markerID", "", "success", "endMarker", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "apiKey", "setKey", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "setMetadata", "(Lcom/statsig/androidsdk/StatsigMetadata;)V", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "setDiagnostics", "(Lcom/statsig/androidsdk/Diagnostics;)V", "LAn/D;", "getExceptionHandler", "()LAn/D;", "getNoopExceptionHandler", "Lkotlin/Function0;", "task", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "recover", "capture", "(LBm/a;Ljava/lang/String;LBm/k;Ljava/lang/String;)V", TokenNames.f32019T, "Lqm/c;", "captureAsync", "(LBm/k;Lqm/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "(LBm/k;LBm/n;Lqm/c;)Ljava/lang/Object;", "logException$build_release", "logException", "urlString", "Ljava/lang/String;", "getUrlString$build_release", "setUrlString$build_release", "Lcom/statsig/androidsdk/StatsigMetadata;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "seen", "Ljava/util/HashSet;", "Lcom/statsig/androidsdk/Diagnostics;", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ErrorBoundary {
    private String apiKey;
    private Diagnostics diagnostics;
    private StatsigMetadata statsigMetadata;
    private String urlString = "https://statsigapi.net/v1/sdk_exception";
    private HashSet<String> seen = new HashSet<>();

    /* JADX INFO: renamed from: com.statsig.androidsdk.ErrorBoundary$captureAsync$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.ErrorBoundary", m20656f = "ErrorBoundary.kt", m20657l = {86}, m20658m = "captureAsync")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C127781<T> extends AbstractC19687c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C127781(InterfaceC18770c<? super C127781> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ErrorBoundary.this.captureAsync(null, this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.ErrorBoundary$captureAsync$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.ErrorBoundary", m20656f = "ErrorBoundary.kt", m20657l = {95, 98}, m20658m = "captureAsync")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C127792<T> extends AbstractC19687c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C127792(InterfaceC18770c<? super C127792> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ErrorBoundary.this.captureAsync(null, null, this);
        }
    }

    public static /* synthetic */ void capture$default(ErrorBoundary errorBoundary, InterfaceC1426a interfaceC1426a, String str, InterfaceC1436k interfaceC1436k, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            interfaceC1436k = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        errorBoundary.capture(interfaceC1426a, str, interfaceC1436k, str2);
    }

    private final void endMarker(String tag, String markerID, boolean success, String configName) {
        Diagnostics diagnostics = this.diagnostics;
        KeyType keyTypeConvertFromString = KeyType.INSTANCE.convertFromString(tag == null ? "" : tag);
        if (tag == null || diagnostics == null || keyTypeConvertFromString == null) {
            return;
        }
        diagnostics.markEnd(keyTypeConvertFromString, success, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Marker(null, null, null, null, null, null, null, null, null, null, markerID, null, null, null, configName, null, null, null, null, null, 1031167, null), (8 & 16) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleException(Throwable exception) {
        PrintStream printStream = System.out;
        printStream.println((Object) "[Statsig]: An unexpected exception occurred.");
        printStream.println(exception);
        if (exception instanceof ExternalException) {
            return;
        }
        logException$build_release(exception);
    }

    private final String startMarker(String tag, String configName) {
        Diagnostics diagnostics = this.diagnostics;
        KeyType keyTypeConvertFromString = KeyType.INSTANCE.convertFromString(tag == null ? "" : tag);
        if (tag == null || diagnostics == null || keyTypeConvertFromString == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) tag);
        sb2.append('_');
        ContextType contextType = ContextType.API_CALL;
        sb2.append(diagnostics.getMarkers(contextType).size());
        String string = sb2.toString();
        diagnostics.setDiagnosticsContext(contextType);
        Diagnostics.markStart$default(diagnostics, keyTypeConvertFromString, null, new Marker(null, null, null, null, null, null, null, null, null, null, string, null, null, null, configName, null, null, null, null, null, 1031167, null), null, 8, null);
        return string;
    }

    public final void capture(InterfaceC1426a task, String tag, InterfaceC1436k recover, String configName) {
        AbstractC16544l.m18094g(task, "task");
        String str = "";
        try {
            String strStartMarker = startMarker(tag, configName);
            if (strStartMarker != null) {
                str = strStartMarker;
            }
            task.invoke();
            endMarker(tag, str, true, configName);
        } catch (Exception e10) {
            endMarker(tag, str, false, configName);
            handleException(e10);
            if (recover == null) {
                return;
            }
            recover.invoke(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object captureAsync(InterfaceC1436k interfaceC1436k, InterfaceC18770c<? super T> interfaceC18770c) {
        C127781 c127781;
        ErrorBoundary errorBoundary;
        if (interfaceC18770c instanceof C127781) {
            c127781 = (C127781) interfaceC18770c;
            int i10 = c127781.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c127781.label = i10 - Integer.MIN_VALUE;
            } else {
                c127781 = new C127781(interfaceC18770c);
            }
        } else {
            c127781 = new C127781(interfaceC18770c);
        }
        Object obj = c127781.result;
        Object obj2 = EnumC19250a.f61036Y;
        int i11 = c127781.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            try {
                c127781.L$0 = this;
                c127781.label = 1;
                Object objInvoke = interfaceC1436k.invoke(c127781);
                return objInvoke == obj2 ? obj2 : objInvoke;
            } catch (Exception e10) {
                e = e10;
                errorBoundary = this;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            errorBoundary = (ErrorBoundary) c127781.L$0;
            try {
                AbstractC9233X.m9807c(obj);
                return obj;
            } catch (Exception e11) {
                e = e11;
            }
        }
        errorBoundary.handleException(e);
        return null;
    }

    public final InterfaceC0567D getExceptionHandler() {
        return new C12780x1ee85748(C0565C.f1783Y, this);
    }

    public final InterfaceC0567D getNoopExceptionHandler() {
        return new C12781x1451b306(C0565C.f1783Y);
    }

    /* JADX INFO: renamed from: getUrl, reason: from getter */
    public final String getUrlString() {
        return this.urlString;
    }

    public final String getUrlString$build_release() {
        return this.urlString;
    }

    public final void logException$build_release(Throwable exception) {
        AbstractC16544l.m18094g(exception, "exception");
        try {
            InterfaceC0567D noopExceptionHandler = getNoopExceptionHandler();
            C3516e c3516e = AbstractC0593T.f1824a;
            AbstractC0575H.m1156D(AbstractC0575H.m1174c(noopExceptionHandler.plus(ExecutorC3515d.f10633Z)), null, null, new ErrorBoundary$logException$1(this, exception, null), 3);
        } catch (Exception unused) {
        }
    }

    public final void setDiagnostics(Diagnostics diagnostics) {
        AbstractC16544l.m18094g(diagnostics, "diagnostics");
        this.diagnostics = diagnostics;
        if (Math.floor(Math.random() * ((double) ErrorBoundaryKt.SAMPLING_RATE)) == 0.0d) {
            diagnostics.setMaxMarkers(ContextType.API_CALL, 30);
        } else {
            diagnostics.setMaxMarkers(ContextType.API_CALL, 0);
        }
    }

    public final void setKey(String apiKey) {
        AbstractC16544l.m18094g(apiKey, "apiKey");
        this.apiKey = apiKey;
    }

    public final void setMetadata(StatsigMetadata statsigMetadata) {
        AbstractC16544l.m18094g(statsigMetadata, "statsigMetadata");
        this.statsigMetadata = statsigMetadata;
    }

    public final void setUrlString$build_release(String str) {
        AbstractC16544l.m18094g(str, "<set-?>");
        this.urlString = str;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object captureAsync(InterfaceC1436k interfaceC1436k, InterfaceC1439n interfaceC1439n, InterfaceC18770c<? super T> interfaceC18770c) {
        C127792 c127792;
        ErrorBoundary errorBoundary;
        if (interfaceC18770c instanceof C127792) {
            c127792 = (C127792) interfaceC18770c;
            int i10 = c127792.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c127792.label = i10 - Integer.MIN_VALUE;
            } else {
                c127792 = new C127792(interfaceC18770c);
            }
        } else {
            c127792 = new C127792(interfaceC18770c);
        }
        Object objInvoke = c127792.result;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c127792.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objInvoke);
            try {
                c127792.L$0 = this;
                c127792.L$1 = interfaceC1439n;
                c127792.label = 1;
                objInvoke = interfaceC1436k.invoke(c127792);
                if (objInvoke == obj) {
                    return obj;
                }
            } catch (Exception e10) {
                e = e10;
                errorBoundary = this;
                errorBoundary.handleException(e);
                c127792.L$0 = null;
                c127792.L$1 = null;
                c127792.label = 2;
                objInvoke = interfaceC1439n.invoke(e, c127792);
                if (objInvoke == obj) {
                    return obj;
                }
            }
        } else if (i11 == 1) {
            interfaceC1439n = (InterfaceC1439n) c127792.L$1;
            errorBoundary = (ErrorBoundary) c127792.L$0;
            try {
                AbstractC9233X.m9807c(objInvoke);
            } catch (Exception e11) {
                e = e11;
                errorBoundary.handleException(e);
                c127792.L$0 = null;
                c127792.L$1 = null;
                c127792.label = 2;
                objInvoke = interfaceC1439n.invoke(e, c127792);
                if (objInvoke == obj) {
                    return obj;
                }
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objInvoke);
        }
        return objInvoke;
    }
}
