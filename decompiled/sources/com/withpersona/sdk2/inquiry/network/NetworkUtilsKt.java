package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.javax.sip.parser.TokenNames;
import bj.C11447L;
import bj.C11473t;
import dj.AbstractC13178c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mo.C17327D;
import mo.C17328E;
import p026Ao.C0675i;
import p049Bm.InterfaceC1436k;
import p1027tp.C20048M;
import p1113xn.AbstractC21322p;
import p185H6.C3246b;
import p200Hm.C3508g;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u001aC\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0010\u001aW\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00042\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u0006H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0001*\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001c"}, m18067d2 = {"Ltp/M;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "toErrorInfo", "(Ltp/M;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", TokenNames.f32019T, "Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "Lkotlin/Function1;", "Lmm/C;", "action", "onFailure", "(Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;LBm/k;)Lcom/withpersona/sdk2/inquiry/network/NetworkCallResult;", "onSuccess", "Lqm/c;", "", "call", "enqueueRetriableRequestWithRetry", "(LBm/k;Lqm/c;)Ljava/lang/Object;", "enqueueVerificationRequestWithRetry", "", "shouldRetry", "enqueueWithRetryWhen", "(LBm/k;LBm/k;Lqm/c;)Ljava/lang/Object;", "Ljava/net/SocketTimeoutException;", "toSocketTimeoutErrorInfo", "(Ljava/net/SocketTimeoutException;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "", "NUM_RETRIES", TokenNames.f32012I, "network_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueRetriableRequestWithRetry$2 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"<anonymous>", "", TokenNames.f32019T, "error", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "invoke", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)Ljava/lang/Boolean;"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128852 extends AbstractC16546n implements InterfaceC1436k {
        public static final C128852 INSTANCE = new C128852();

        public C128852() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Boolean invoke(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            return Boolean.valueOf(networkErrorInfo.isRecoverable());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueVerificationRequestWithRetry$2 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"<anonymous>", "", TokenNames.f32019T, "error", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "invoke", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)Ljava/lang/Boolean;"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128862 extends AbstractC16546n implements InterfaceC1436k {
        public static final C128862 INSTANCE = new C128862();

        public C128862() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Boolean invoke(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            int code = networkErrorInfo.getCode();
            return Boolean.valueOf((code == 0 || code == 409 || code == 413 || code == 422) ? false : true);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueWithRetryWhen$1 */
    @InterfaceC19689e(m20655c = "com.withpersona.sdk2.inquiry.network.NetworkUtilsKt", m20656f = "NetworkUtils.kt", m20657l = {174}, m20658m = "enqueueWithRetryWhen")
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128871<T> extends AbstractC19687c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C128871(InterfaceC18770c<? super C128871> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NetworkUtilsKt.enqueueWithRetryWhen(null, null, this);
        }
    }

    public static final <T> Object enqueueRetriableRequestWithRetry(InterfaceC1436k interfaceC1436k, InterfaceC18770c<? super NetworkCallResult<T>> interfaceC18770c) {
        return enqueueWithRetryWhen(interfaceC1436k, C128852.INSTANCE, interfaceC18770c);
    }

    public static final <T> Object enqueueVerificationRequestWithRetry(InterfaceC1436k interfaceC1436k, InterfaceC18770c<? super NetworkCallResult<T>> interfaceC18770c) {
        return enqueueWithRetryWhen(interfaceC1436k, C128862.INSTANCE, interfaceC18770c);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object enqueueWithRetryWhen(p049Bm.InterfaceC1436k r6, p049Bm.InterfaceC1436k r7, p972qm.InterfaceC18770c<? super com.withpersona.sdk2.inquiry.network.NetworkCallResult<T>> r8) {
        /*
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.network.NetworkUtilsKt.C128871
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = (com.withpersona.sdk2.inquiry.network.NetworkUtilsKt.C128871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = new com.withpersona.sdk2.inquiry.network.NetworkUtilsKt$enqueueWithRetryWhen$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            Bm.k r7 = (p049Bm.InterfaceC1436k) r7
            java.lang.Object r2 = r0.L$0
            Bm.k r2 = (p049Bm.InterfaceC1436k) r2
            p571X9.AbstractC9233X.m9807c(r8)
            r5 = r0
            r0 = r7
            r7 = r2
            r2 = r5
            goto L5d
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            p571X9.AbstractC9233X.m9807c(r8)
            r8 = 0
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r0
        L46:
            r0 = r8
            r8 = r5
            r4 = 3
            if (r6 >= r4) goto L84
            r2.L$0 = r7
            r2.L$1 = r8
            r2.I$0 = r6
            r2.label = r3
            java.lang.Object r0 = r7.invoke(r2)
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r5 = r0
            r0 = r8
            r8 = r5
        L5d:
            tp.M r8 = (p1027tp.C20048M) r8
            mo.D r4 = r8.f63525a
            boolean r4 = r4.m18985a()
            if (r4 == 0) goto L6f
            com.withpersona.sdk2.inquiry.network.NetworkCallResult$Success r6 = new com.withpersona.sdk2.inquiry.network.NetworkCallResult$Success
            java.lang.Object r7 = r8.f63526b
            r6.<init>(r7)
            return r6
        L6f:
            com.withpersona.sdk2.inquiry.network.InternalErrorInfo$NetworkErrorInfo r8 = toErrorInfo(r8)
            java.lang.Object r4 = r0.invoke(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L81
            r0 = r8
            goto L84
        L81:
            int r6 = r6 + r3
            r5 = r0
            goto L46
        L84:
            com.withpersona.sdk2.inquiry.network.NetworkCallResult$Failure r6 = new com.withpersona.sdk2.inquiry.network.NetworkCallResult$Failure
            if (r0 == 0) goto L8c
            r6.<init>(r0)
            return r6
        L8c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.NetworkUtilsKt.enqueueWithRetryWhen(Bm.k, Bm.k, qm.c):java.lang.Object");
    }

    public static final <T> NetworkCallResult<T> onFailure(NetworkCallResult<T> networkCallResult, InterfaceC1436k action) {
        AbstractC16544l.m18094g(networkCallResult, "<this>");
        AbstractC16544l.m18094g(action, "action");
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            action.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    public static final <T> NetworkCallResult<T> onSuccess(NetworkCallResult<T> networkCallResult, InterfaceC1436k action) {
        AbstractC16544l.m18094g(networkCallResult, "<this>");
        AbstractC16544l.m18094g(action, "action");
        if (networkCallResult instanceof NetworkCallResult.Success) {
            action.invoke(((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173 A[EDGE_INSN: B:117:0x0173->B:118:0x0174 BREAK  A[LOOP:5: B:112:0x0162->B:151:?]] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x012d  */
    public static final InternalErrorInfo.NetworkErrorInfo toErrorInfo(C20048M<?> c20048m) throws Exception {
        ErrorResponse errorResponse;
        List<ErrorResponse.Error> errors;
        List<ErrorResponse.Error> errors2;
        List<ErrorResponse.Error> errors3;
        List<ErrorResponse.Error> errors4;
        List<ErrorResponse.Error> errors5;
        List<ErrorResponse.Error> errors6;
        List<ErrorResponse.Error> errors7;
        List<ErrorResponse.Error> errors8;
        ErrorResponse.Error error;
        C17327D c17327d = c20048m.f63525a;
        ErrorResponse.Error rateLimitExceededError = null;
        String str = c17327d.f55175o0;
        String str2 = (str == null || AbstractC21322p.m21681O(str)) ? null : c17327d.f55175o0;
        int i10 = c17327d.f55176p0;
        boolean z6 = false;
        if (i10 != 401 && i10 != 404) {
            if (i10 == 429) {
                rateLimitExceededError = new ErrorResponse.Error.RateLimitExceededError("Quota exceeded", "");
            } else {
                HttpStatusCode httpStatusCode = HttpStatusCode.INSTANCE;
                C3508g client_errors = httpStatusCode.getCLIENT_ERRORS();
                int i11 = client_errors.f10591Y;
                if (i10 > client_errors.f10592Z || i11 > i10) {
                    C3508g server_errors = httpStatusCode.getSERVER_ERRORS();
                    int i12 = server_errors.f10591Y;
                    if (i10 > server_errors.f10592Z || i12 > i10) {
                        z6 = true;
                    }
                } else {
                    C17328E c17328e = c20048m.f63527c;
                    if (c17328e != null) {
                        try {
                            C0675i c0675i = (C0675i) c17328e.f55190p0;
                            C3246b c3246b = new C3246b();
                            c3246b.m4134a(ErrorResponse.INSTANCE.getAdapter());
                            errorResponse = (ErrorResponse) new C11447L(c3246b).m12850b(ErrorResponse.class, AbstractC13178c.f41820a, null).fromJson(c0675i.clone());
                        } catch (Exception e10) {
                            if (!(e10 instanceof C11473t) && !(e10 instanceof IOException)) {
                                throw e10;
                            }
                            errorResponse = null;
                        }
                    } else {
                        errorResponse = null;
                    }
                    if (errorResponse != null && (errors8 = errorResponse.getErrors()) != null && (error = (ErrorResponse.Error) AbstractC17680n.m19343S(errors8)) != null) {
                        String description = error.getDescription();
                        if (description == null) {
                            description = error.getTitle();
                        }
                        if (description != null) {
                            str2 = description;
                        }
                    }
                    if (errorResponse != null && (errors7 = errorResponse.getErrors()) != null && !errors7.isEmpty()) {
                        Iterator<T> it = errors7.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                if (errorResponse != null) {
                                                    z6 = true;
                                                    break;
                                                }
                                                z6 = true;
                                                break;
                                            }
                                            if (errorResponse != null) {
                                                z6 = true;
                                                break;
                                            }
                                            z6 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z6 = true;
                                                break;
                                            }
                                            z6 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z6 = true;
                                                break;
                                            }
                                            z6 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z6 = true;
                                                break;
                                            }
                                            z6 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z6 = true;
                                    break;
                                }
                                z6 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it.next()) instanceof ErrorResponse.Error.InactiveTemplateError) {
                            }
                        }
                    } else if (errorResponse != null && (errors5 = errorResponse.getErrors()) != null && !errors5.isEmpty()) {
                        Iterator<T> it2 = errors5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            if (errorResponse != null) {
                                                z6 = true;
                                                break;
                                            }
                                            z6 = true;
                                            break;
                                        }
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z6 = true;
                                    break;
                                }
                                z6 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it2.next()) instanceof ErrorResponse.Error.InvalidConfigError) {
                            }
                        }
                    } else if (errorResponse != null && (errors4 = errorResponse.getErrors()) != null && !errors4.isEmpty()) {
                        Iterator<T> it3 = errors4.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        if (errorResponse != null) {
                                            z6 = true;
                                            break;
                                        }
                                        z6 = true;
                                        break;
                                    }
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z6 = true;
                                    break;
                                }
                                z6 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it3.next()) instanceof ErrorResponse.Error.UnauthenticatedError) {
                            }
                        }
                    } else if (errorResponse != null && (errors3 = errorResponse.getErrors()) != null && !errors3.isEmpty()) {
                        Iterator<T> it4 = errors3.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                if (errorResponse != null) {
                                    if (errorResponse != null) {
                                        z6 = true;
                                        break;
                                    }
                                    z6 = true;
                                    break;
                                }
                                if (errorResponse != null) {
                                    z6 = true;
                                    break;
                                }
                                z6 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it4.next()) instanceof ErrorResponse.Error.InconsistentTransitionError) {
                            }
                        }
                    } else if (errorResponse != null && (errors2 = errorResponse.getErrors()) != null && !errors2.isEmpty()) {
                        Iterator<T> it5 = errors2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                if (errorResponse != null) {
                                    z6 = true;
                                    break;
                                }
                                z6 = true;
                                break;
                            }
                            if (((ErrorResponse.Error) it5.next()) instanceof ErrorResponse.Error.TransitionFromTerminalStateError) {
                            }
                        }
                    } else if (errorResponse != null && (errors = errorResponse.getErrors()) != null && !errors.isEmpty()) {
                        Iterator<T> it6 = errors.iterator();
                        do {
                            if (!it6.hasNext()) {
                                z6 = true;
                                break;
                            }
                        } while (!(((ErrorResponse.Error) it6.next()) instanceof ErrorResponse.Error.FieldNotFoundError));
                    } else {
                        z6 = true;
                        break;
                    }
                    if (errorResponse != null && (errors6 = errorResponse.getErrors()) != null) {
                        rateLimitExceededError = (ErrorResponse.Error) AbstractC17680n.m19343S(errors6);
                    }
                    if (rateLimitExceededError instanceof ErrorResponse.Error.UnknownError) {
                        ((ErrorResponse.Error.UnknownError) rateLimitExceededError).setErrorBody(c17328e);
                    }
                }
            }
        }
        return new InternalErrorInfo.NetworkErrorInfo(i10, str2, z6, rateLimitExceededError);
    }

    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
