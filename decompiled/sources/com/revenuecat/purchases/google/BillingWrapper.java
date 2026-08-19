package com.revenuecat.purchases.google;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.auth0.android.request.internal.RunnableC11843b;
import com.google.android.gms.internal.play_billing.AbstractC11988o0;
import com.google.android.gms.internal.play_billing.C11935b;
import com.google.android.gms.internal.play_billing.InterfaceC11943d;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p007A5.C0376k;
import p011A9.p012Ra.ahZQMZ;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p449S9.C7042K;
import p468T2.C7214f;
import p500Ua.ResultReceiverC7594c;
import p571X9.AbstractC9393x3;
import p582Xk.HXHG.TfazcFv;
import p658b5.C11248s;
import p826j6.AbstractC16144M;
import p826j6.AbstractC16148b;
import p826j6.C16149c;
import p826j6.C16151e;
import p826j6.C16152f;
import p826j6.C16153g;
import p826j6.C16154h;
import p826j6.C16155i;
import p826j6.C16156j;
import p826j6.C16157k;
import p826j6.C16162p;
import p826j6.InterfaceC16150d;
import p826j6.InterfaceC16165s;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002¬\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u0018J[\u0010'\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u001c\u0010#\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u00140\u001fj\u0002`\"2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`%H\u0016¢\u0006\u0004\b'\u0010(JE\u00104\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105JC\u00109\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001d2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002060 \u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001f¢\u0006\u0004\b9\u0010:JE\u0010<\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0 \u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\b<\u0010:J/\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u0002022\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ3\u0010H\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001fH\u0000¢\u0006\u0004\bF\u0010GJ3\u0010K\u001a\u00020\u00142\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001fH\u0000¢\u0006\u0004\bJ\u0010GJK\u0010N\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020;0L\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\bN\u0010:JO\u0010Q\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001d2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fH\u0016¢\u0006\u0004\bQ\u0010RJ+\u0010W\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u001d2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001fH\u0001¢\u0006\u0004\bU\u0010VJ'\u0010\\\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020X2\u000e\u0010[\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010 H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0014H\u0016¢\u0006\u0004\b`\u0010\u0018J\u000f\u0010a\u001a\u000202H\u0016¢\u0006\u0004\ba\u0010bJ3\u0010g\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0 2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00140eH\u0016¢\u0006\u0004\bg\u0010hJ;\u0010i\u001a\u00020\u00142\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00140\u001fj\u0002`%H\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0014H\u0002¢\u0006\u0004\bk\u0010\u0018J1\u0010m\u001a\u00020\u00142\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\u0010l\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010p\u001a\u00020oH\u0003¢\u0006\u0004\bq\u0010rJG\u0010t\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\u001d2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u001f2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u0014H\u0002¢\u0006\u0004\bv\u0010\u0018J#\u0010y\u001a\u00020\u00142\u0012\u0010x\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020\u001dH\u0002¢\u0006\u0004\b{\u0010|J+\u0010~\u001a\u00020\u00142\u0006\u0010>\u001a\u00020Z2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00140\u001fH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0018JE\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020$0\u0083\u00012\b\u0010\u0082\u0001\u001a\u00030\u0081\u00012\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J;\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020$0\u0083\u00012\b\u0010\u0082\u0001\u001a\u00030\u0086\u00012\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JE\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020$0\u0083\u00012\b\u0010\u0082\u0001\u001a\u00030\u0089\u00012\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001b\u0010\u008d\u0001\u001a\u00020\u00142\u0007\u0010\u008c\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008f\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0090\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0091\u0001R\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0092\u0001R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0093\u0001R6\u0010\u0095\u0001\u001a\u0004\u0018\u00010w2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010w8F@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R4\u0010\u009d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u00018\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u0012\u0005\b¡\u0001\u0010\u0018\u001a\u0006\b\u009f\u0001\u0010 \u0001R;\u0010¤\u0001\u001a&\u0012!\u0012\u001f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u00140\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00120£\u00010¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\"\u0010¨\u0001\u001a\u0002022\u0007\u0010\u0094\u0001\u001a\u0002028B@BX\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0013\u0010«\u0001\u001a\u0002028F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010b¨\u0006\u00ad\u0001"}, m18067d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lj6/s;", "Lj6/d;", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "clientFactory", "Landroid/os/Handler;", "mainHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchasesStateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/common/DateProvider;)V", "", "delayMilliseconds", "Lmm/C;", "startConnectionOnMainThread", "(J)V", "startConnection", "()V", "endConnection", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "", "productIds", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;LBm/k;LBm/k;)V", "Landroid/app/Activity;", "activity", "appUserID", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryPurchaseHistoryAsync", "(Ljava/lang/String;LBm/k;LBm/k;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "queryAllPurchases", "finishTransactions", "purchase", "shouldConsume", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;ZLcom/revenuecat/purchases/PostReceiptInitiationSource;)V", "token", "onConsumed", "consumePurchase$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;LBm/k;)V", "consumePurchase", "onAcknowledged", "acknowledge$purchases_customEntitlementComputationRelease", "acknowledge", "", "onSuccess", "queryPurchases", "productId", "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;LBm/k;LBm/k;)V", "purchaseToken", "listener", "getPurchaseType$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;LBm/k;)V", "getPurchaseType", "Lj6/i;", "billingResult", "Lcom/android/billingclient/api/Purchase;", "purchases", "onPurchasesUpdated", "(Lj6/i;Ljava/util/List;)V", "onBillingSetupFinished", "(Lj6/i;)V", "onBillingServiceDisconnected", "isConnected", "()Z", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;LBm/a;)V", "getStorefront", "(LBm/k;LBm/k;)V", "executePendingRequests", "request", "executeRequestOnUIThread", "(Ljava/lang/Long;LBm/k;)V", "Lj6/h;", "params", "launchBillingFlow", "(Landroid/app/Activity;Lj6/h;)V", "resultHandler", "queryPurchaseType", "(Ljava/lang/String;Ljava/lang/String;LBm/k;LBm/k;)V", "retryBillingServiceConnectionWithExponentialBackoff", "Lj6/b;", "receivingFunction", "withConnectedClient", "(LBm/k;)V", "getStackTrace", "()Ljava/lang/String;", "completion", "getStoreTransaction", "(Lcom/android/billingclient/api/Purchase;LBm/k;)V", "trackProductDetailsNotSupportedIfNeeded", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "purchaseInfo", "Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "buildOneTimePurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "error", "sendErrorsToAllPendingRequests", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "Landroid/os/Handler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/DateProvider;", "<set-?>", "billingClient", "Lj6/b;", "getBillingClient", "()Lj6/b;", "setBillingClient", "(Lj6/b;)V", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "Ljava/util/Map;", "getPurchaseContext$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "getPurchaseContext$purchases_customEntitlementComputationRelease$annotations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lmm/l;", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "reconnectMilliseconds", "J", "reconnectionAlreadyScheduled", "Z", "getAppInBackground", "appInBackground", "ClientFactory", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BillingWrapper extends BillingAbstract implements InterfaceC16165s, InterfaceC16150d {
    private volatile AbstractC16148b billingClient;
    private final ClientFactory clientFactory;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<C17309l> serviceRequests;

    @Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "Landroid/content/Context;", "context", "", "pendingTransactionsForPrepaidPlansEnabled", "<init>", "(Landroid/content/Context;Z)V", "Lj6/s;", "listener", "Lj6/b;", "buildClient", "(Lj6/s;)Lj6/b;", "Landroid/content/Context;", "Z", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z6) {
            AbstractC16544l.m18094g(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z6;
        }

        public final AbstractC16148b buildClient(InterfaceC16165s listener) {
            AbstractC16544l.m18094g(listener, "listener");
            C0376k c0376k = new C0376k(this.pendingTransactionsForPrepaidPlansEnabled, 10);
            C7214f c7214f = new C7214f(this.context);
            c7214f.f22888a = c0376k;
            c7214f.f22890c = listener;
            return c7214f.m7605a();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127131 extends AbstractC16541i implements InterfaceC1436k {
        public C127131(Object obj) {
            super(1, 0, DeviceCache.class, obj, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C17296C.f55119a;
        }

        public final void invoke(String p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127142 extends AbstractC16541i implements InterfaceC1436k {
        public C127142(Object obj) {
            super(1, 0, DeviceCache.class, obj, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C17296C.f55119a;
        }

        public final void invoke(String p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$3 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127153 extends AbstractC16541i implements InterfaceC1436k {
        public C127153(Object obj) {
            super(1, 0, DeviceCache.class, obj, "addSuccessfullyPostedToken", "addSuccessfullyPostedToken(Ljava/lang/String;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C17296C.f55119a;
        }

        public final void invoke(String p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((DeviceCache) this.receiver).addSuccessfullyPostedToken(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lj6/e;", "billingConfig", "Lmm/C;", "invoke", "(Lj6/e;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127171 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127171(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$onSuccess = interfaceC1436k;
        }

        public final void invoke(C16151e billingConfig) {
            AbstractC16544l.m18094g(billingConfig, "billingConfig");
            InterfaceC1436k interfaceC1436k = this.$onSuccess;
            String str = billingConfig.f50138a;
            AbstractC16544l.m18093f(str, "billingConfig.countryCode");
            interfaceC1436k.invoke(str);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C16151e) obj);
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127182 extends AbstractC16541i implements InterfaceC1436k {
        public C127182(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1436k) obj);
            return C17296C.f55119a;
        }

        public final void invoke(InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getStorefront$3 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127193 extends AbstractC16541i implements InterfaceC1439n {
        public C127193(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (InterfaceC1436k) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(Long l4, InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l4, p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127201 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ C16154h $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127201(Activity activity, C16154h c16154h) {
            super(1);
            this.$activity = activity;
            this.$params = c16154h;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC16148b) obj);
            return C17296C.f55119a;
        }

        public final void invoke(AbstractC16148b withConnectedClient) {
            AbstractC16544l.m18094g(withConnectedClient, "$this$withConnectedClient");
            C16155i c16155iMo17712f = withConnectedClient.mo17712f(this.$activity, this.$params);
            if (c16155iMo17712f.f50151a == 0) {
                c16155iMo17712f = null;
            }
            if (c16155iMo17712f != null) {
                AbstractC12107L1.m13831v(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(c16155iMo17712f)}, 1, BillingStrings.BILLING_INTENT_FAILED, LogIntent.GOOGLE_ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127212 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $appUserID;
        final /* synthetic */ Boolean $isPersonalizedPrice;
        final /* synthetic */ PurchasingData $purchasingData;
        final /* synthetic */ ReplaceProductInfo $replaceProductInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127212(PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str, Boolean bool, Activity activity) {
            super(1);
            this.$purchasingData = purchasingData;
            this.$replaceProductInfo = replaceProductInfo;
            this.$appUserID = str;
            this.$isPersonalizedPrice = bool;
            this.$activity = activity;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
            Result resultBuildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) this.$purchasingData, this.$replaceProductInfo, this.$appUserID, this.$isPersonalizedPrice);
            if (resultBuildPurchaseParams instanceof Result.Success) {
                BillingWrapper.this.launchBillingFlow(this.$activity, (C16154h) ((Result.Success) resultBuildPurchaseParams).getValue());
            } else {
                if (!(resultBuildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) resultBuildPurchaseParams).getValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "subsPurchasesList", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127221 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $onReceivePurchaseHistory;
        final /* synthetic */ InterfaceC1436k $onReceivePurchaseHistoryError;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "inAppPurchasesList", "Lmm/C;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ InterfaceC1436k $onReceivePurchaseHistory;
            final /* synthetic */ List<PurchaseHistoryRecord> $subsPurchasesList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(InterfaceC1436k interfaceC1436k, List<? extends PurchaseHistoryRecord> list) {
                super(1);
                this.$onReceivePurchaseHistory = interfaceC1436k;
                this.$subsPurchasesList = list;
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends PurchaseHistoryRecord>) obj);
                return C17296C.f55119a;
            }

            public final void invoke(List<? extends PurchaseHistoryRecord> inAppPurchasesList) {
                AbstractC16544l.m18094g(inAppPurchasesList, "inAppPurchasesList");
                InterfaceC1436k interfaceC1436k = this.$onReceivePurchaseHistory;
                List<PurchaseHistoryRecord> list = this.$subsPurchasesList;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it.next(), ProductType.SUBS));
                }
                List<? extends PurchaseHistoryRecord> list2 = inAppPurchasesList;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(StoreTransactionConversionsKt.toStoreTransaction((PurchaseHistoryRecord) it2.next(), ProductType.INAPP));
                }
                interfaceC1436k.invoke(AbstractC17680n.m19361k0(arrayList2, arrayList));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127221(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
            super(1);
            this.$onReceivePurchaseHistoryError = interfaceC1436k;
            this.$onReceivePurchaseHistory = interfaceC1436k2;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends PurchaseHistoryRecord>) obj);
            return C17296C.f55119a;
        }

        public final void invoke(List<? extends PurchaseHistoryRecord> subsPurchasesList) {
            AbstractC16544l.m18094g(subsPurchasesList, "subsPurchasesList");
            BillingWrapper.this.queryPurchaseHistoryAsync("inapp", new AnonymousClass1(this.$onReceivePurchaseHistory, subsPurchasesList), this.$onReceivePurchaseHistoryError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127231 extends AbstractC16541i implements InterfaceC1436k {
        public C127231(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1436k) obj);
            return C17296C.f55119a;
        }

        public final void invoke(InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127242 extends AbstractC16541i implements InterfaceC1439n {
        public C127242(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (InterfaceC1436k) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(Long l4, InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l4, p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$3 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127273 extends AbstractC16541i implements InterfaceC1436k {
        public C127273(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1436k) obj);
            return C17296C.f55119a;
        }

        public final void invoke(InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$4 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127284 extends AbstractC16541i implements InterfaceC1439n {
        public C127284(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (InterfaceC1436k) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(Long l4, InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l4, p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127291 extends AbstractC16541i implements InterfaceC1436k {
        public C127291(Object obj) {
            super(1, 0, BillingWrapper.class, obj, "withConnectedClient", "withConnectedClient(Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1436k) obj);
            return C17296C.f55119a;
        }

        public final void invoke(InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p0");
            ((BillingWrapper) this.receiver).withConnectedClient(p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class C127302 extends AbstractC16541i implements InterfaceC1439n {
        public C127302(Object obj) {
            super(2, 0, BillingWrapper.class, obj, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V");
        }

        @Override // p049Bm.InterfaceC1439n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Long) obj, (InterfaceC1436k) obj2);
            return C17296C.f55119a;
        }

        public final void invoke(Long l4, InterfaceC1436k p10) {
            AbstractC16544l.m18094g(p10, "p1");
            ((BillingWrapper) this.receiver).executeRequestOnUIThread(l4, p10);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127311 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ C16156j $inAppMessageParams;
        final /* synthetic */ InterfaceC1426a $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lj6/b;", "Lmm/C;", "invoke", "(Lj6/b;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {
            final /* synthetic */ C16156j $inAppMessageParams;
            final /* synthetic */ InterfaceC1426a $subscriptionStatusChange;
            final /* synthetic */ WeakReference<Activity> $weakActivity;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(WeakReference<Activity> weakReference, C16156j c16156j, InterfaceC1426a interfaceC1426a) {
                super(1);
                this.$weakActivity = weakReference;
                this.$inAppMessageParams = c16156j;
                this.$subscriptionStatusChange = interfaceC1426a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$1(InterfaceC1426a subscriptionStatusChange, C16157k inAppMessageResult) {
                AbstractC16544l.m18094g(subscriptionStatusChange, "$subscriptionStatusChange");
                AbstractC16544l.m18094g(inAppMessageResult, "inAppMessageResult");
                int i10 = inAppMessageResult.f50154a;
                if (i10 == 0) {
                    LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                } else if (i10 != 1) {
                    LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)), null, 2, null);
                } else {
                    LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                    subscriptionStatusChange.invoke();
                }
            }

            @Override // p049Bm.InterfaceC1436k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC16148b) obj);
                return C17296C.f55119a;
            }

            public final void invoke(AbstractC16148b withConnectedClient) {
                AbstractC16544l.m18094g(withConnectedClient, "$this$withConnectedClient");
                final Activity activity = this.$weakActivity.get();
                if (activity == null) {
                    LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                    return;
                }
                C16156j c16156j = this.$inAppMessageParams;
                C12734c c12734c = new C12734c(this.$subscriptionStatusChange);
                final C16149c c16149c = (C16149c) withConnectedClient;
                if (!c16149c.mo17749e()) {
                    AbstractC11988o0.m13512g("BillingClient", "Service disconnected.");
                    C16155i c16155i = AbstractC16144M.f50078a;
                    return;
                }
                if (!c16149c.f50127p) {
                    AbstractC11988o0.m13512g("BillingClient", "Current client doesn't support showing in-app messages.");
                    C16155i c16155i2 = AbstractC16144M.f50078a;
                    return;
                }
                View viewFindViewById = activity.findViewById(R.id.content);
                IBinder windowToken = viewFindViewById.getWindowToken();
                Rect rect = new Rect();
                viewFindViewById.getGlobalVisibleRect(rect);
                final Bundle bundle = new Bundle();
                bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
                bundle.putInt("KEY_DIMEN_LEFT", rect.left);
                bundle.putInt("KEY_DIMEN_TOP", rect.top);
                bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
                bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
                bundle.putString("playBillingLibraryVersion", c16149c.f50114c);
                bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c16156j.f50153a);
                Handler handler = c16149c.f50115d;
                final ResultReceiverC7594c resultReceiverC7594c = new ResultReceiverC7594c(handler, c12734c, 1);
                C16149c.m17750i(new Callable() { // from class: j6.y
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC11943d interfaceC11943d;
                        C16149c c16149c2 = c16149c;
                        Bundle bundle2 = bundle;
                        Activity activity2 = activity;
                        ResultReceiverC7594c resultReceiverC7594c2 = resultReceiverC7594c;
                        c16149c2.getClass();
                        try {
                            synchronized (c16149c2.f50112a) {
                                interfaceC11943d = c16149c2.f50119h;
                            }
                            if (interfaceC11943d == null) {
                                c16149c2.m17755C(-1, 119, null);
                            } else {
                                ((C11935b) interfaceC11943d).m13403C(c16149c2.f50117f.getPackageName(), bundle2, new BinderC16134C(new WeakReference(activity2), resultReceiverC7594c2));
                            }
                        } catch (DeadObjectException e10) {
                            c16149c2.m17755C(-1, 118, e10);
                        } catch (Exception e11) {
                            c16149c2.m17755C(6, 118, e11);
                        }
                        return null;
                    }
                }, 5000L, null, handler, c16149c.m17763m());
                C16155i c16155i3 = AbstractC16144M.f50078a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127311(WeakReference<Activity> weakReference, C16156j c16156j, InterfaceC1426a interfaceC1426a) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = c16156j;
            this.$subscriptionStatusChange = interfaceC1426a;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError) {
            if (purchasesError != null) {
                LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
            } else {
                BillingWrapper.this.withConnectedClient(new AnonymousClass1(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
            }
        }
    }

    public /* synthetic */ BillingWrapper(ClientFactory clientFactory, Handler handler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientFactory, handler, deviceCache, diagnosticsTracker, purchasesStateProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final Result<C16154h, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct purchaseInfo, String appUserID, Boolean isPersonalizedPrice) {
        C11248s c11248s = new C11248s(25, false);
        C16162p productDetails = purchaseInfo.getProductDetails();
        c11248s.f34081Z = productDetails;
        if (productDetails.m17779a() != null) {
            productDetails.m17779a().getClass();
            String str = productDetails.m17779a().f50160d;
            if (str != null) {
                c11248s.f34082o0 = str;
            }
        }
        C16162p c16162p = (C16162p) c11248s.f34081Z;
        if (c16162p == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        if (c16162p.f50184j != null && ((String) c11248s.f34082o0) == null) {
            throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        C16153g c16153g = new C16153g(c11248s);
        C16152f c16152f = new C16152f();
        C7042K c7042k = new C7042K();
        c7042k.f22494a = 0;
        c7042k.f22495b = true;
        c16152f.f50142d = c7042k;
        c16152f.f50140b = new ArrayList(AbstractC9393x3.m9974d(c16153g));
        c16152f.f50139a = UtilsKt.sha256(appUserID);
        if (isPersonalizedPrice != null) {
            c16152f.f50141c = isPersonalizedPrice.booleanValue();
        }
        return new Result.Success(c16152f.m17776a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Result<C16154h, PurchasesError> buildPurchaseParams(GooglePurchasingData purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        if (purchaseInfo instanceof GooglePurchasingData.InAppProduct) {
            return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) purchaseInfo, appUserID, isPersonalizedPrice);
        }
        if (purchaseInfo instanceof GooglePurchasingData.Subscription) {
            return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) purchaseInfo, replaceProductInfo, appUserID, isPersonalizedPrice);
        }
        throw new C0644w();
    }

    private final Result<C16154h, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
        C11248s c11248s = new C11248s(25, false);
        String token = purchaseInfo.getToken();
        if (TextUtils.isEmpty(token)) {
            throw new IllegalArgumentException("offerToken can not be empty");
        }
        c11248s.f34082o0 = token;
        C16162p productDetails = purchaseInfo.getProductDetails();
        c11248s.f34081Z = productDetails;
        if (productDetails.m17779a() != null) {
            productDetails.m17779a().getClass();
            String str = productDetails.m17779a().f50160d;
            if (str != null) {
                c11248s.f34082o0 = str;
            }
        }
        C16162p c16162p = (C16162p) c11248s.f34081Z;
        if (c16162p == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        if (c16162p.f50184j != null && ((String) c11248s.f34082o0) == null) {
            throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        C16153g c16153g = new C16153g(c11248s);
        C16152f c16152f = new C16152f();
        C7042K c7042k = new C7042K();
        c7042k.f22494a = 0;
        c7042k.f22495b = true;
        c16152f.f50142d = c7042k;
        c16152f.f50140b = new ArrayList(AbstractC9393x3.m9974d(c16153g));
        if (replaceProductInfo != null) {
            BillingFlowParamsExtensionsKt.setUpgradeInfo(c16152f, replaceProductInfo);
        } else {
            c16152f.f50139a = UtilsKt.sha256(appUserID);
        }
        if (isPersonalizedPrice != null) {
            c16152f.f50141c = isPersonalizedPrice.booleanValue();
        }
        return new Result.Success(c16152f.m17776a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$9(BillingWrapper this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        synchronized (this$0) {
            try {
                AbstractC16148b abstractC16148b = this$0.billingClient;
                if (abstractC16148b != null) {
                    LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{abstractC16148b}, 1)));
                    abstractC16148b.mo17711c();
                }
                this$0.billingClient = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void executePendingRequests() {
        C17309l c17309lPoll;
        synchronized (this) {
            while (true) {
                try {
                    AbstractC16148b abstractC16148b = this.billingClient;
                    if (abstractC16148b == null || !abstractC16148b.mo17749e() || (c17309lPoll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    final InterfaceC1436k interfaceC1436k = (InterfaceC1436k) c17309lPoll.f55136Y;
                    Long l4 = (Long) c17309lPoll.f55137Z;
                    if (l4 != null) {
                        final int i10 = 0;
                        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(interfaceC1436k);
                                        break;
                                    default:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(interfaceC1436k);
                                        break;
                                }
                            }
                        }, l4.longValue());
                    } else {
                        final int i11 = 1;
                        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(interfaceC1436k);
                                        break;
                                    default:
                                        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(interfaceC1436k);
                                        break;
                                }
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$0(InterfaceC1436k request) {
        AbstractC16544l.m18094g(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executePendingRequests$lambda$3$lambda$2$lambda$1(InterfaceC1436k request) {
        AbstractC16544l.m18094g(request, "$request");
        request.invoke(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long delayMilliseconds, InterfaceC1436k request) {
        try {
            if (getPurchasesUpdatedListener() != null) {
                this.serviceRequests.add(new C17309l(request, delayMilliseconds));
                AbstractC16148b abstractC16148b = this.billingClient;
                if (abstractC16148b == null || abstractC16148b.mo17749e()) {
                    executePendingRequests();
                } else {
                    BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
                }
            } else {
                request.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l4, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l4 = null;
        }
        billingWrapper.executeRequestOnUIThread(l4, interfaceC1436k);
    }

    /* JADX INFO: renamed from: getPurchaseContext$purchases_customEntitlementComputationRelease$annotations */
    public static /* synthetic */ void m14474x65d79bc3() {
    }

    private final void getStoreTransaction(Purchase purchase, InterfaceC1436k completion) {
        AbstractC12107L1.m13831v(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1, BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, LogIntent.DEBUG);
        synchronized (this) {
            PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
            if (purchaseContext != null && purchaseContext.getProductType() != null) {
                completion.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                return;
            }
            String strM13149b = purchase.m13149b();
            AbstractC16544l.m18093f(strM13149b, "purchase.purchaseToken");
            getPurchaseType$purchases_customEntitlementComputationRelease(strM13149b, new BillingWrapper$getStoreTransaction$1$2(completion, purchase));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(Activity activity, C16154h params) {
        if (activity.getIntent() == null) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.NULL_ACTIVITY_INTENT);
        }
        withConnectedClient(new C127201(activity, params));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$18(C16155i billingResult, BillingWrapper this$0) {
        PurchasesError purchasesErrorBillingResponseToPurchasesError;
        AbstractC16544l.m18094g(billingResult, "$billingResult");
        AbstractC16544l.m18094g(this$0, "this$0");
        int i10 = billingResult.f50151a;
        if (i10 != 6) {
            if (i10 != 7 && i10 != 8) {
                if (i10 != 12) {
                    switch (i10) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
                            if (AbstractC16544l.m18089b(billingResult.f50152b, ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                purchasesErrorBillingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            } else {
                                purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.f50151a, String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1)));
                                LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
                            }
                            this$0.sendErrorsToAllPendingRequests(purchasesErrorBillingResponseToPurchasesError);
                            break;
                        case 0:
                            LogIntent logIntent = LogIntent.DEBUG;
                            AbstractC16148b abstractC16148b = this$0.billingClient;
                            LogWrapperKt.log(logIntent, String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(new Object[]{abstractC16148b != null ? abstractC16148b.toString() : null}, 1)));
                            BillingAbstract.StateListener stateListener = this$0.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            this$0.executePendingRequests();
                            this$0.reconnectMilliseconds = 1000L;
                            this$0.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                }
            }
            AbstractC12107L1.m13831v(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
            return;
        }
        AbstractC12107L1.m13831v(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1, BillingStrings.BILLING_CLIENT_ERROR, LogIntent.GOOGLE_WARNING);
        this$0.retryBillingServiceConnectionWithExponentialBackoff();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseType(String productType, String purchaseToken, InterfaceC1436k listener, InterfaceC1436k resultHandler) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), productType), new C127251(resultHandler, purchaseToken), new C127262(listener), new C127273(this), new C127284(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            LogWrapperKt.log(LogIntent.WARNING, BillingStrings.BILLING_CLIENT_RETRY_ALREADY_SCHEDULED);
            return;
        }
        AbstractC12107L1.m13831v(new Object[]{Long.valueOf(this.reconnectMilliseconds)}, 1, BillingStrings.BILLING_CLIENT_RETRY, LogIntent.WARNING);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 900000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(PurchasesError error) {
        while (true) {
            C17309l c17309lPoll = this.serviceRequests.poll();
            if (c17309lPoll != null) {
                this.mainHandler.post(new RunnableC11843b((InterfaceC1436k) c17309lPoll.f55136Y, 3, error));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startConnectionOnMainThread$lambda$4(BillingWrapper this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.startConnection();
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        int i10;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        AbstractC16148b abstractC16148b = this.billingClient;
        C16155i c16155iMo17748d = abstractC16148b != null ? abstractC16148b.mo17748d("fff") : null;
        if (c16155iMo17748d == null || (i10 = c16155iMo17748d.f50151a) != -2) {
            return;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        String str = c16155iMo17748d.f50152b;
        AbstractC16544l.m18093f(str, "billingResult.debugMessage");
        diagnosticsTracker.trackProductDetailsNotSupported(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withConnectedClient(InterfaceC1436k receivingFunction) {
        AbstractC16148b abstractC16148b = this.billingClient;
        C17296C c17296c = null;
        if (abstractC16148b != null) {
            if (!abstractC16148b.mo17749e()) {
                abstractC16148b = null;
            }
            if (abstractC16148b != null) {
                receivingFunction.invoke(abstractC16148b);
                c17296c = C17296C.f55119a;
            }
        }
        if (c17296c == null) {
            AbstractC12107L1.m13831v(new Object[]{getStackTrace()}, 1, BillingStrings.BILLING_CLIENT_DISCONNECTED, LogIntent.GOOGLE_WARNING);
        }
    }

    public final void acknowledge$purchases_customEntitlementComputationRelease(String token, PostReceiptInitiationSource initiationSource, InterfaceC1436k onAcknowledged) {
        AbstractC16544l.m18094g(token, "token");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        AbstractC16544l.m18094g(onAcknowledged, "onAcknowledged");
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1)));
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onAcknowledged, BillingWrapper$acknowledge$1.INSTANCE, new BillingWrapper$acknowledge$2(this), new BillingWrapper$acknowledge$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        AbstractC16544l.m18094g(purchase, "purchase");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean zOptBoolean = originalGooglePurchase != null ? originalGooglePurchase.f35952c.optBoolean("acknowledged", true) : false;
        if (purchase.getType() != ProductType.INAPP) {
            if (!finishTransactions || zOptBoolean) {
                this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
                return;
            } else {
                acknowledge$purchases_customEntitlementComputationRelease(purchase.getPurchaseToken(), initiationSource, new C127153(this.deviceCache));
                return;
            }
        }
        if (finishTransactions && shouldConsume) {
            consumePurchase$purchases_customEntitlementComputationRelease(purchase.getPurchaseToken(), initiationSource, new C127131(this.deviceCache));
        } else if (!finishTransactions || zOptBoolean) {
            this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
        } else {
            LogWrapperKt.log(LogIntent.PURCHASE, PurchaseStrings.NOT_CONSUMING_IN_APP_PURCHASE_ACCORDING_TO_BACKEND);
            acknowledge$purchases_customEntitlementComputationRelease(purchase.getPurchaseToken(), initiationSource, new C127142(this.deviceCache));
        }
    }

    public final void consumePurchase$purchases_customEntitlementComputationRelease(String token, PostReceiptInitiationSource initiationSource, InterfaceC1436k onConsumed) {
        AbstractC16544l.m18094g(token, "token");
        AbstractC16544l.m18094g(initiationSource, "initiationSource");
        AbstractC16544l.m18094g(onConsumed, "onConsumed");
        LogWrapperKt.log(LogIntent.PURCHASE, String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1)));
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onConsumed, BillingWrapper$consumePurchase$1.INSTANCE, new BillingWrapper$consumePurchase$2(this), new BillingWrapper$consumePurchase$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void endConnection() {
        this.mainHandler.post(new RunnableC12733b(this, 0));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String productId, InterfaceC1436k onCompletion, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(productId, "productId");
        AbstractC16544l.m18094g(onCompletion, "onCompletion");
        AbstractC16544l.m18094g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2)));
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        C17296C c17296c = null;
        if (googleProductType != null) {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new BillingWrapper$findPurchaseInPurchaseHistory$1$1(productType, onCompletion, productId, onError), onError, new BillingWrapper$findPurchaseInPurchaseHistory$1$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$1$3(this)), 0L, 1, null);
            c17296c = C17296C.f55119a;
        }
        if (c17296c == null) {
            onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    public final synchronized AbstractC16148b getBillingClient() {
        return this.billingClient;
    }

    public final Map<String, PurchaseContext> getPurchaseContext$purchases_customEntitlementComputationRelease() {
        return this.purchaseContext;
    }

    public final void getPurchaseType$purchases_customEntitlementComputationRelease(String purchaseToken, InterfaceC1436k listener) {
        AbstractC16544l.m18094g(purchaseToken, "purchaseToken");
        AbstractC16544l.m18094g(listener, "listener");
        queryPurchaseType("subs", purchaseToken, listener, new BillingWrapper$getPurchaseType$1(listener, this, purchaseToken));
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void getStorefront(InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        LogUtilsKt.verboseLog(BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
        BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new C127171(onSuccess), onError, new C127182(this), new C127193(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    /* JADX INFO: renamed from: isConnected */
    public boolean getConnected() {
        AbstractC16148b abstractC16148b = this.billingClient;
        if (abstractC16148b != null) {
            return abstractC16148b.mo17749e();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, Boolean isPersonalizedPrice) {
        String optionId;
        ReplacementMode replacementMode;
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(purchasingData, "purchasingData");
        GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnknownError, String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2)));
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new C0644w();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            AbstractC12107L1.m13831v(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2, PurchaseStrings.UPGRADING_SKU, LogIntent.PURCHASE);
        } else {
            AbstractC12107L1.m13831v(new Object[]{googlePurchasingData.getProductId()}, 1, PurchaseStrings.PURCHASING_PRODUCT, LogIntent.PURCHASE);
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                replacementMode = null;
            }
            String productId = replacementMode == GoogleReplacementMode.DEFERRED ? (String) AbstractC17680n.m19341Q(replaceProductInfo.getOldPurchase().getProductIds()) : googlePurchasingData.getProductId();
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode2 = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            map.put(productId, new PurchaseContext(productType, presentedOfferingContext, optionId, replacementMode2 instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode2 : null));
        }
        executeRequestOnUIThread$default(this, null, new C127212(purchasingData, replaceProductInfo, appUserID, isPersonalizedPrice, activity), 1, null);
    }

    @Override // p826j6.InterfaceC16150d
    public void onBillingServiceDisconnected() {
        LogIntent logIntent = LogIntent.WARNING;
        AbstractC16148b abstractC16148b = this.billingClient;
        AbstractC12107L1.m13831v(new Object[]{abstractC16148b != null ? abstractC16148b.toString() : null}, 1, BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, logIntent);
    }

    @Override // p826j6.InterfaceC16150d
    public void onBillingSetupFinished(C16155i billingResult) {
        AbstractC16544l.m18094g(billingResult, "billingResult");
        this.mainHandler.post(new RunnableC11843b(billingResult, 2, this));
    }

    @Override // p826j6.InterfaceC16165s
    public void onPurchasesUpdated(C16155i billingResult, List<? extends Purchase> purchases) {
        AbstractC16544l.m18094g(billingResult, "billingResult");
        List<? extends Purchase> list = purchases == null ? C17689w.f56480Y : purchases;
        if (billingResult.f50151a == 0 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new BillingWrapper$onPurchasesUpdated$1$1(arrayList, list, this));
            }
            return;
        }
        LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsKt.toHumanReadableDescription(billingResult)}, 1)));
        String str = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            str = "Purchases:" + AbstractC17680n.m19349Y(list, ", ", null, null, 0, null, BillingWrapper$onPurchasesUpdated$3$1.INSTANCE, 30);
        }
        sb2.append(str);
        LogWrapperKt.log(logIntent, sb2.toString());
        String str2 = "Error updating purchases. " + BillingResultExtensionsKt.toHumanReadableDescription(billingResult);
        int i10 = billingResult.f50151a;
        if (purchases == null && i10 == 0) {
            str2 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            i10 = 6;
        }
        PurchasesError purchasesErrorBillingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(i10, str2);
        LogUtilsKt.errorLog(purchasesErrorBillingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesErrorBillingResponseToPurchasesError);
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, InterfaceC1436k onReceivePurchaseHistory, InterfaceC1436k onReceivePurchaseHistoryError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        AbstractC16544l.m18094g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync("subs", new C127221(onReceivePurchaseHistoryError, onReceivePurchaseHistory), onReceivePurchaseHistoryError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, Set<String> productIds, InterfaceC1436k onReceive, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(productIds, "productIds");
        AbstractC16544l.m18094g(onReceive, "onReceive");
        AbstractC16544l.m18094g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{AbstractC17680n.m19349Y(productIds, null, null, null, 0, null, null, 63)}, 1)));
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productIds, productType, getAppInBackground()), onReceive, onError, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    public final void queryPurchaseHistoryAsync(String productType, InterfaceC1436k onReceivePurchaseHistory, InterfaceC1436k onReceivePurchaseHistoryError) {
        AbstractC16544l.m18094g(productType, "productType");
        AbstractC16544l.m18094g(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        AbstractC16544l.m18094g(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        LogWrapperKt.log(LogIntent.DEBUG, String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{productType}, 1)));
        BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productType, getAppInBackground()), onReceivePurchaseHistory, onReceivePurchaseHistoryError, new C127231(this), new C127242(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, InterfaceC1436k onSuccess, InterfaceC1436k onError) {
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccess, "onSuccess");
        AbstractC16544l.m18094g(onError, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, RestoreStrings.QUERYING_PURCHASE);
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), onSuccess, onError, new C127291(this), new C127302(this)), 0L, 1, null);
    }

    public final synchronized void setBillingClient(AbstractC16148b abstractC16148b) {
        this.billingClient = abstractC16148b;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = this.clientFactory.buildClient(this);
                }
                this.reconnectionAlreadyScheduled = false;
                AbstractC16148b abstractC16148b = this.billingClient;
                if (abstractC16148b != null && !abstractC16148b.mo17749e()) {
                    LogWrapperKt.log(LogIntent.DEBUG, String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{abstractC16148b}, 1)));
                    try {
                        abstractC16148b.mo17714h(this);
                    } catch (IllegalStateException e10) {
                        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e10}, 1)));
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e10.getMessage()));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        this.mainHandler.postDelayed(new RunnableC12733b(this, 1), delayMilliseconds);
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127262 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1436k $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127262(InterfaceC1436k interfaceC1436k) {
            super(1);
            this.$listener = interfaceC1436k;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            LogUtilsKt.errorLog(error);
            this.$listener.invoke(ProductType.UNKNOWN);
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        AbstractC16544l.m18093f(string, TfazcFv.ULr);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendErrorsToAllPendingRequests$lambda$31$lambda$30(InterfaceC1436k serviceRequest, PurchasesError purchasesError) {
        AbstractC16544l.m18094g(serviceRequest, "$serviceRequest");
        AbstractC16544l.m18094g(purchasesError, ahZQMZ.AlyPseVf);
        serviceRequest.invoke(purchasesError);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, InterfaceC1426a subscriptionStatusChange) {
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC16544l.m18094g(inAppMessageTypes, "inAppMessageTypes");
        AbstractC16544l.m18094g(subscriptionStatusChange, "subscriptionStatusChange");
        if (inAppMessageTypes.isEmpty()) {
            LogUtilsKt.errorLog$default(qffLJgOYizGmMj.RBRaawORRT, null, 2, null);
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(it.next().getInAppMessageCategoryId()));
        }
        executeRequestOnUIThread$default(this, null, new C127311(new WeakReference(activity), new C16156j(hashSet), subscriptionStatusChange), 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler mainHandler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, DateProvider dateProvider) {
        super(purchasesStateProvider);
        AbstractC16544l.m18094g(clientFactory, "clientFactory");
        AbstractC16544l.m18094g(mainHandler, "mainHandler");
        AbstractC16544l.m18094g(deviceCache, "deviceCache");
        AbstractC16544l.m18094g(purchasesStateProvider, "purchasesStateProvider");
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        this.clientFactory = clientFactory;
        this.mainHandler = mainHandler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.dateProvider = dateProvider;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$1 */
    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Lmm/C;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127251 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ InterfaceC1436k $resultHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127251(InterfaceC1436k interfaceC1436k, String str) {
            super(1);
            this.$resultHandler = interfaceC1436k;
            this.$purchaseToken = str;
        }

        public final void invoke(Map<String, StoreTransaction> purchases) {
            AbstractC16544l.m18094g(purchases, "purchases");
            InterfaceC1436k interfaceC1436k = this.$resultHandler;
            Collection<StoreTransaction> collectionValues = purchases.values();
            String str = this.$purchaseToken;
            boolean z6 = false;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (AbstractC16544l.m18089b(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                        z6 = true;
                        break;
                    }
                }
            }
            interfaceC1436k.invoke(Boolean.valueOf(z6));
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, StoreTransaction>) obj);
            return C17296C.f55119a;
        }
    }
}
